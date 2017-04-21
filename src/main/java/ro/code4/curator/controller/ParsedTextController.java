package ro.code4.curator.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.code4.curator.service.ParsedInputService;
import ro.code4.curator.transferObjects.ParsedInputTO;

@Controller
@RequestMapping("/input/parsed")
public class ParsedTextController {

	@Autowired
	private ParsedInputService parsedInputService;

	@ApiOperation(value = "createOrUpdate")
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody HttpStatus acceptParsedText(@RequestBody ParsedInputTO input) {
		parsedInputService.acceptTextParsing(input);
		return HttpStatus.OK;
	}

	@ApiOperation(value = "getAll")
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<ParsedInputTO> getAll() {
		return parsedInputService.list();
	}

	@ApiOperation(value = "getById")
	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public @ResponseBody ParsedInputTO getById(@PathVariable int id) {
		return parsedInputService.getById(id);
	}
}
