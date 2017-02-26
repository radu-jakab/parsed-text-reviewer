package ro.code4.textParserReview.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class ParsedInputFields {
	private int id;
	private ParsedInput parsedInputParent;
	private ParsedInputFields parentField;

	private String fieldName;
	private int startPos;
	private int endPos;
	private String parsedValue;
	private double votes;
	private String parserId;

}
