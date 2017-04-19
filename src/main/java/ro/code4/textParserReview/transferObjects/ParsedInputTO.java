package ro.code4.textParserReview.transferObjects;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ParsedInputTO {
	private int entityId;

	private String fullText;
	private String textType;
	private String textSourceId;
	private boolean reviewed;

	private List<ParsedInputFieldTO> parsedFields = new ArrayList<>();
}
