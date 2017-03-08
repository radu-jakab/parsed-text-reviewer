package ro.code4.textParserReview.converter;

import ro.code4.textParserReview.entity.ReviewedInputField;
import ro.code4.textParserReview.transferObjects.ParsedInputFieldTO;

public class ReviewedInputFieldConverter {
	public ReviewedInputField convertTOtoEntity(ParsedInputFieldTO to) {
		ReviewedInputField result = new ReviewedInputField();

		result.setFieldName(to.getFieldName());
		result.setParsedValue(to.getParsedValue());
		result.setStartPos(to.getStartPos());
		result.setEndPos(to.getEndPos());
		result.setParserId(to.getParserId());

		return result;
	}

	public ParsedInputFieldTO convertEntityToTO(ReviewedInputField entity) {
		ParsedInputFieldTO to = new ParsedInputFieldTO();

		to.setFieldName(entity.getFieldName());
		to.setParsedValue(entity.getParsedValue());
		to.setStartPos(entity.getStartPos());
		to.setEndPos(entity.getEndPos());
		to.setParserId(entity.getParserId());

		return to;
	}
}
