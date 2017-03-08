package ro.code4.textParserReview.transferObjects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import ro.code4.textParserReview.entity.ParsedInput;
import ro.code4.textParserReview.entity.ParsedInputField;

public class ParsedInputFieldTO {
	@JsonBackReference(value = "parsedInputId")
	private ParsedInput parsedInputId;
	@JsonBackReference(value = "parentField")
	private ParsedInputField parentField;

	private String fieldName;
	private int startPos;
	private int endPos;
	private String parsedValue;
	private String parserId;
	private String parentFieldName;

	public ParsedInputFieldTO() {
	}

	public ParsedInputFieldTO(ParsedInput parsedInputId, ParsedInputField parentField, String fieldName, int startPos, int endPos,
			String parsedValue, String parserId, String parentFieldName) {
		super();
		this.parsedInputId = parsedInputId;
		this.parentField = parentField;
		this.fieldName = fieldName;
		this.startPos = startPos;
		this.endPos = endPos;
		this.parsedValue = parsedValue;
		this.parserId = parserId;
		this.parentFieldName = parentFieldName;
	}

	public String getParentFieldName() {
		return parentFieldName;
	}

	public void setParentFieldName(String parentFieldName) {
		this.parentFieldName = parentFieldName;
	}

	public ParsedInput getParsedInputId() {
		return parsedInputId;
	}

	public void setParsedInputId(ParsedInput parsedInputId) {
		this.parsedInputId = parsedInputId;
	}

	public ParsedInputField getParentField() {
		return parentField;
	}

	public void setParentField(ParsedInputField parentField) {
		this.parentField = parentField;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public int getStartPos() {
		return startPos;
	}

	public void setStartPos(int startPos) {
		this.startPos = startPos;
	}

	public int getEndPos() {
		return endPos;
	}

	public void setEndPos(int endPos) {
		this.endPos = endPos;
	}

	public String getParsedValue() {
		return parsedValue;
	}

	public void setParsedValue(String parsedValue) {
		this.parsedValue = parsedValue;
	}

	public String getParserId() {
		return parserId;
	}

	public void setParserId(String parserId) {
		this.parserId = parserId;
	}

}
