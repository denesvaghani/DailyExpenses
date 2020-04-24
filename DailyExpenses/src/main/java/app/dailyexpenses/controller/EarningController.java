package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app.dailyexpenses.model.Earn;

@Controller
@RequestMapping("../earning")
public class EarningController {

	@RequestMapping(value = "/add")
	public String saveEarning(@ModelAttribute("earn") Earn earn) {
		return "addEarning";
	}
}