package ro.code4.textParserReview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ReviewedInputField {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	private ReviewedInput reviewedInputId;

	@OneToOne
	private ReviewedInputField parentField;

	private String fieldName;
	private int startPos;
	private int endPos;
	private String parsedValue;
	private double votes;
	private String parserId;
}
