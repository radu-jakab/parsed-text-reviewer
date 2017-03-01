package ro.code4.textParserReview.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.textParserReview.entity.ParsedInput;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/parsedInput")
public class ReceiveParsedInput {

	@ApiIgnore
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String hello(HttpServletRequest request) {
		return "Greetings from parsedTextReviewer!";
	}

	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody String acceptParsedText(@RequestBody ParsedInput input) {
		return "accepted!";
	}
}
