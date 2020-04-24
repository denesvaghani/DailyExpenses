package app.dailyexpenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import app.dailyexpenses.model.Spent;

@Controller
@RequestMapping("../spent")
public class SpentController {
	
	@RequestMapping(value = "/add")
	public String saveSpent(@ModelAttribute("spent") Spent spent) {
		return "addSpent";
	}
}