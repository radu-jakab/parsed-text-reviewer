package ro.code4.curator.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.curator.service.ReviewedInputService;
import ro.code4.curator.transferObjects.ParsedInputTO;
import ro.code4.curator.transferObjects.ShallowReviewedInputTO;

@Controller
@RequestMapping("/input/reviewed")
public class ReviewedTextController {
	@Autowired
	private ReviewedInputService reviewedInputService;

	@ApiOperation(value = "createOrUpdate")
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody HttpStatus submitReviewedInput(@RequestBody String parsedInputId, @RequestBody ParsedInputTO reviewedInputTO) {
		reviewedInputService.submitReviewedInput(parsedInputId, reviewedInputTO);
		return HttpStatus.OK;
	}

	@ApiOperation(value = "getAll")
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<ShallowReviewedInputTO> getAll() {
		return reviewedInputService.list();
	}
}
