package ro.code4.textParserReview.transferObjects;

import java.util.ArrayList;
import java.util.List;

public class ParsedInputTO {
	private int entityId;

	private String fullText;
	private String textType;
	private String textSourceId;

	private List<ParsedInputFieldTO> parsedFields = new ArrayList<>();

	public ParsedInputTO() {
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

	public List<ParsedInputFieldTO> getParsedFields() {
		return parsedFields;
	}

	public void setParsedFields(List<ParsedInputFieldTO> parsedFields) {
		this.parsedFields = parsedFields;
	}

	public int getEntityId() {
		return entityId;
	}

	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
}
