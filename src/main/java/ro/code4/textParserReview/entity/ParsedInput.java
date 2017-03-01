package ro.code4.textParserReview.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ParsedInput {
	@Id
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;

	@OneToMany
	private List<ParsedInputFields> parsedFields;

	public ParsedInput() {
	}

	public ParsedInput(int id, String fullText, String textType, String textSourceId, List<ParsedInputFields> parsedFields) {
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

	public List<ParsedInputFields> getParsedFields() {
		return parsedFields;
	}

	public void setParsedFields(List<ParsedInputFields> parsedFields) {
		this.parsedFields = parsedFields;
	}

}
