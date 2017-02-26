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
public class ParsedInput {
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;
}
