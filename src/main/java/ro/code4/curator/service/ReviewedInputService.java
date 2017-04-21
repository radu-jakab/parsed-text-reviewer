package ro.code4.curator.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.code4.curator.converter.ReviewedInputConverter;
import ro.code4.curator.entity.ParsedInput;
import ro.code4.curator.entity.ReviewedInput;
import ro.code4.curator.repository.ParsedInputRepository;
import ro.code4.curator.repository.ReviewedInputRepository;
import ro.code4.curator.transferObjects.ParsedInputTO;
import ro.code4.curator.transferObjects.ShallowReviewedInputTO;

@Service
public class ReviewedInputService {

	@Autowired
	private ReviewedInputRepository reviewedInputRepo;

	@Autowired
	private ParsedInputRepository parsedInputRepository;

	public void submitReviewedInput(String parsedInputId, ParsedInputTO reviewedInputTO) {
		// check if there is already a reviewed input entry for this textType + id
		String textType = reviewedInputTO.getTextType();
		String sourceId = reviewedInputTO.getTextSourceId();
		ReviewedInput existingEntity = reviewedInputRepo.findByTextTypeAndTextSourceId(textType, sourceId);

		if (existingEntity != null) {
			// if yes, throw exception for now
			throw new EntityExistsException(
					"A reviewed record for this object already exists. Sending updates to reviewed instances is not supported at this time.");
		} else {
			// if not, convert to an entity
			ReviewedInputConverter converter = new ReviewedInputConverter();
			ReviewedInput entity = converter.convertTOtoEntity(reviewedInputTO);

			// and save it
			reviewedInputRepo.save(entity);
			entity = reviewedInputRepo.findByTextTypeAndTextSourceId(textType, sourceId);

			// mark the parsed input as reviewed
			ParsedInput parsedInput = parsedInputRepository.findOne(parsedInputId);
			parsedInput.setReviewed(true);
			parsedInput.setReviewedInputId(entity.getId());
			parsedInputRepository.save(parsedInput);
		}
	}

	public List<ShallowReviewedInputTO> list() {
		List<ShallowReviewedInputTO> result = new ArrayList<>();
		Iterable<ReviewedInput> reviewedInputList = reviewedInputRepo.findAll();
		ReviewedInputConverter converter = new ReviewedInputConverter();

		// for each entity, pick only the shallow copy
		for (ReviewedInput entity : reviewedInputList)
			result.add(converter.convertEntityToShallowTO(entity));

		return result;
	}

}
