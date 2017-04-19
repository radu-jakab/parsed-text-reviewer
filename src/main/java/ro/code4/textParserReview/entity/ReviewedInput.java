package ro.code4.textParserReview.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ReviewedInput {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;

	@OneToMany(mappedBy = "reviewedInputId", cascade = CascadeType.ALL)
	private List<ReviewedInputField> reviewedFields = new ArrayList<>();
}
