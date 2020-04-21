package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/earning")
public class EarningController {

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEarning() {
		return "home";
	}
}