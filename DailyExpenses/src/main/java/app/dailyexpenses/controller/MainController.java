package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;

@Controller
@RequestMapping("/")
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping({"*/addSpent","/addSpent"})
	public String redirectToSpent(@ModelAttribute("addSpent") Spent spent) {
		return "addSpent";
	}

	@RequestMapping({"*/addEarning","/addEarning"})
	public String redirectToEarn(@ModelAttribute("addEarn") Earn earn) {
		return "addEarning";
	}

}
