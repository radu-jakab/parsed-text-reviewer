package ro.code4.textParserReview.converter;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import ro.code4.textParserReview.entity.ReviewedInput;
import ro.code4.textParserReview.entity.ReviewedInputField;
import ro.code4.textParserReview.transferObjects.ParsedInputFieldTO;
import ro.code4.textParserReview.transferObjects.ParsedInputTO;

public class ReviewedInputConverter {
	private static Logger LOGGER = Logger.getLogger(ReviewedInputConverter.class);

	public ReviewedInput convertTOtoEntity(ParsedInputTO to) {
		ReviewedInput result = new ReviewedInput();

		// set own properties
		result.setId(to.getEntityId());
		result.setTextSourceId(to.getTextSourceId());
		result.setTextType(to.getTextType());
		result.setFullText(to.getFullText());

		// iterate parsed input fields
		Map<ParsedInputFieldTO, ReviewedInputField> fieldsMapping = new HashMap<>();
		ReviewedInputFieldConverter fieldConverter = new ReviewedInputFieldConverter();
		for (ParsedInputFieldTO fieldTO : to.getParsedFields()) {
			ReviewedInputField convertedField = fieldConverter.convertTOtoEntity(fieldTO);
			convertedField.setReviewedInputParent(result);
			result.getReviewedFields().add(convertedField);
			fieldsMapping.put(fieldTO, convertedField);
		}

		// check if fields have parent fields that need to be matched
		for (ParsedInputFieldTO fieldTO : to.getParsedFields()) {
			if (fieldTO.getParentFieldName() != null && !fieldTO.getParentFieldName().isEmpty()) {
				// find the parent field
				boolean found = false;
				for (ReviewedInputField parentCandidate : result.getReviewedFields())
					if (fieldTO.getParentFieldName().equals(parentCandidate.getFieldName())) {
						fieldsMapping.get(fieldTO).setParentField(parentCandidate);
						found = true;
						break;
					}

				if (!found)
					LOGGER.error("Could not find parent field |" + fieldTO.getParentFieldName() + "| for field |" + fieldTO.getFieldName()
							+ "|");
			}
		}

		return result;
	}

	public ParsedInputTO convertEntityToTO(ReviewedInput entity) {
		ParsedInputTO result = new ParsedInputTO();

		// set own properties
		result.setEntityId(entity.getId());
		result.setFullText(entity.getFullText());
		result.setTextSourceId(entity.getTextSourceId());
		result.setTextType(entity.getTextType());

		// set parsed input fields
		ReviewedInputFieldConverter fieldConverter = new ReviewedInputFieldConverter();
		for (ReviewedInputField field : entity.getReviewedFields()) {
			ParsedInputFieldTO fieldTO = fieldConverter.convertEntityToTO(field);
			result.getParsedFields().add(fieldTO);
		}

		return result;
	}
}
