package ro.code4.curator.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class ParsedInput {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullText;
	private String textType;
	private String textSourceId;
	private boolean reviewed;
	private int reviewedInputId;

	@OneToMany(mappedBy = "parsedInputId", cascade = CascadeType.ALL)
	private List<ParsedInputField> parsedFields = new ArrayList<>();
}
