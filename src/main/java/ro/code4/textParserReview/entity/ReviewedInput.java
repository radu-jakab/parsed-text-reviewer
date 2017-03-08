package ro.code4.textParserReview.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@ToString
@EqualsAndHashCode
public class ReviewedInput {
	@Id
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;

	@OneToMany(mappedBy = "reviewedInputId", cascade = CascadeType.ALL)
	private List<ReviewedInputField> reviewedFields = new ArrayList<>();

	public ReviewedInput() {
	}

	public ReviewedInput(int id, String fullText, String textType, String textSourceId, List<ReviewedInputField> reviewedFields) {
		super();
		this.id = id;
		this.fullText = fullText;
		this.textType = textType;
		this.textSourceId = textSourceId;
		this.reviewedFields = reviewedFields;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullText() {
		return fullText;
	}

	public void setFullText(String fullText) {
		this.fullText = fullText;
	}

	public String getTextType() {
		return textType;
	}

	public void setTextType(String textType) {
		this.textType = textType;
	}

	public String getTextSourceId() {
		return textSourceId;
	}

	public void setTextSourceId(String textSourceId) {
		this.textSourceId = textSourceId;
	}

	public List<ReviewedInputField> getReviewedFields() {
		return reviewedFields;
	}

	public void setReviewedFields(List<ReviewedInputField> reviewedFields) {
		this.reviewedFields = reviewedFields;
	}
}
