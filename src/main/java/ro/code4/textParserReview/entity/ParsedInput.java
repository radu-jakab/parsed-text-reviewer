package ro.code4.textParserReview.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class ParsedInput {
	@Id
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;
	private boolean reviewed;
	private int reviewedInputId;

	@OneToMany(mappedBy = "parsedInputId", cascade = CascadeType.ALL)
	private List<ParsedInputField> parsedFields = new ArrayList<>();
}
