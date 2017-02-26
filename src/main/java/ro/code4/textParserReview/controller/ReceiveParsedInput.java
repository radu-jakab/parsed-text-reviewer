package ro.code4.textParserReview.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ro.code4.textParserReview.entity.ParsedInput;

@Controller
@RequestMapping("/parsedInput")
public class ReceiveParsedInput {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		return "Greetings from parsedTextReviewer!";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String acceptParsedText(@RequestBody ParsedInput input) {
		return null;
	}
}
