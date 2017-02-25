package ro.code4.textParserReview.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceiveParsedInput {

	@RequestMapping("/parsedInput")
	public String hello(HttpServletRequest request) {
		return "Greetings from Spring Boot!";
	}
}
