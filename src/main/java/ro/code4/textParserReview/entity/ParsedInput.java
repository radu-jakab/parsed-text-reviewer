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
public class ParsedInput {
	@Id
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;

	@OneToMany(mappedBy = "parsedInputId", cascade = CascadeType.ALL)
	private List<ParsedInputField> parsedFields = new ArrayList<>();

	public ParsedInput() {
	}

	public ParsedInput(int id, String fullText, String textType, String textSourceId, List<ParsedInputField> parsedFields) {
		super();
		this.id = id;
		this.fullText = fullText;
		this.textType = textType;
		this.textSourceId = textSourceId;
		this.parsedFields = parsedFields;
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

	public List<ParsedInputField> getParsedFields() {
		return parsedFields;
	}

	public void setParsedFields(List<ParsedInputField> parsedFields) {
		this.parsedFields = parsedFields;
	}

}
