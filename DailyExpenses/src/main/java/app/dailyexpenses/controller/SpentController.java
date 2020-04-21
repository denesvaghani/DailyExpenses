package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spent/")
public class SpentController {
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveSpent() {
		System.out.print("in save Exp");
		return "home";
	}
}