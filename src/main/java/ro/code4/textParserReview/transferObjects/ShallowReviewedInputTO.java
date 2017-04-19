package ro.code4.textParserReview.transferObjects;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShallowReviewedInputTO {
	private int id;
	private String textType;
	private String textSourceId;
}
