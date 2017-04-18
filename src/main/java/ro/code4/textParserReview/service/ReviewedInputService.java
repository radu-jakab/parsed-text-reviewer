package ro.code4.textParserReview.service;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.code4.textParserReview.converter.ReviewedInputConverter;
import ro.code4.textParserReview.entity.ReviewedInput;
import ro.code4.textParserReview.repository.ReviewedInputRepository;
import ro.code4.textParserReview.transferObjects.ParsedInputTO;

@Service
public class ReviewedInputService {

	@Autowired
	private ReviewedInputRepository reviewedInputRepo;

	public void submitReviewedInput(String parsedInputId, ParsedInputTO reviewedInputTO) {
		// check if there is already a reviewed input entry for this textType + id
		String textType = reviewedInputTO.getTextType();
		String sourceId = reviewedInputTO.getTextSourceId();
		ReviewedInput existingEntity = reviewedInputRepo.findByTextTypeAndTextSourceId(textType, sourceId);

		if (existingEntity != null) {
			// if yes, throw exception for now
			throw new EntityExistsException(
					"A reviewd record for this object already exists. Sending update to reviewed instances is not supported at this time.");
		} else {
			// if not, convert to an entity
			ReviewedInputConverter converter = new ReviewedInputConverter();
			ReviewedInput entity = converter.convertTOtoEntity(reviewedInputTO);

			// and save it
			reviewedInputRepo.save(entity);
		}
	}

	public List<ParsedInputTO> list() {
		// TODO return all reviewed inputs (maybe without fields - shallow object)
		return null;
	}
}
