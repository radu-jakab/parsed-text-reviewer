package ro.code4.textParserReview.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ParsedInputFields {
	@Id
	private int id;

	@ManyToOne
	@JsonBackReference(value = "parsedInputId")
	private ParsedInput parsedInputId;

	@OneToOne
	@JsonBackReference(value = "parentField")
	private ParsedInputFields parentField;

	private String fieldName;
	private int startPos;
	private int endPos;
	private String parsedValue;
	private double votes;
	private String parserId;

	public ParsedInputFields() {
	}

	public ParsedInputFields(int id, ParsedInput parsedInputId, ParsedInputFields parentField, String fieldName, int startPos, int endPos,
			String parsedValue, double votes, String parserId) {
		super();
		this.id = id;
		this.parsedInputId = parsedInputId;
		this.parentField = parentField;
		this.fieldName = fieldName;
		this.startPos = startPos;
		this.endPos = endPos;
		this.parsedValue = parsedValue;
		this.votes = votes;
		this.parserId = parserId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ParsedInput getParsedInputParent() {
		return parsedInputId;
	}

	public void setParsedInputParent(ParsedInput parsedInputParent) {
		this.parsedInputId = parsedInputParent;
	}

	public ParsedInputFields getParentField() {
		return parentField;
	}

	public void setParentField(ParsedInputFields parentField) {
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

	public double getVotes() {
		return votes;
	}

	public void setVotes(double votes) {
		this.votes = votes;
	}

	public String getParserId() {
		return parserId;
	}

	public void setParserId(String parserId) {
		this.parserId = parserId;
	}

}
