package ro.code4.textParserReview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.textParserReview.transferObjects.ParsedInputTO;

@Controller
@RequestMapping("/reviewedInput")
public class ReviewedInputController {
	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public @ResponseBody String submitReviewedInput(@RequestBody String parsedInputId, @RequestBody ParsedInputTO reviewedInput) {
		// TODO
		return "";
	}
}
