package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.dailyexpenses.model.Earn;

@Controller
@RequestMapping("/earn")
public class EarningController {

	@RequestMapping(value = "/updatedExpenses", method = RequestMethod.POST)
	public String saveEarning(@ModelAttribute("addEarn") Earn earn) {
		System.out.println(earn);
		return "home";
	}
}