package ro.code4.textParserReview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.textParserReview.service.ReviewedInputService;
import ro.code4.textParserReview.transferObjects.ParsedInputTO;
import ro.code4.textParserReview.transferObjects.ShallowReviewedInputTO;

@Controller
@RequestMapping("/reviewedInput")
public class ReviewedInputController {
	@Autowired
	private ReviewedInputService reviewedInputService;

	@RequestMapping(path = "/submit", method = RequestMethod.POST)
	public @ResponseBody HttpStatus submitReviewedInput(@RequestBody String parsedInputId, @RequestBody ParsedInputTO reviewedInputTO) {
		reviewedInputService.submitReviewedInput(parsedInputId, reviewedInputTO);
		return HttpStatus.OK;
	}

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public @ResponseBody List<ShallowReviewedInputTO> getAll() {
		return reviewedInputService.list();
	}
}
