package ro.code4.curator.transferObjects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;
import ro.code4.curator.entity.ParsedInput;
import ro.code4.curator.entity.ParsedInputField;

@Data
@NoArgsConstructor
public class ParsedInputFieldTO {
	@JsonBackReference(value = "parsedInputId")
	private ParsedInput parsedInputId;
	@JsonBackReference(value = "parentField")
	private ParsedInputField parentField;

	private String fieldName;
	private int startPos;
	private int endPos;
	private String parsedValue;
	private String parserId;
	private String parentFieldName;
}
