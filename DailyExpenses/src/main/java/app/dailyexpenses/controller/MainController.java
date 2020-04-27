package app.dailyexpenses.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import app.dailyexpenses.dto.LoginFormDTO;
import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;
import app.dailyexpenses.model.User;
import app.dailyexpenses.service.RegisterUserService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	RegisterUserService registerUserService;

	@RequestMapping("/")
	public String showLogin(@ModelAttribute("loginForm") LoginFormDTO loginForm) {
		return "login";
	}

	@RequestMapping("/login")
	public String loginFormValidation(@Valid @ModelAttribute("loginForm") LoginFormDTO loginForm,
			BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		}
		return "home";
	}

	@RequestMapping(value = "/updatedExpenses", method = RequestMethod.POST)
	public String showUpdatedHomePage(@Valid @ModelAttribute("spent") Spent spent, BindingResult resultSpent,
			@Valid @ModelAttribute("earn") Earn earn, BindingResult resultEarn) {
		return "home";
	}

	@RequestMapping("/registration")
	public String showRegisterationPage(@ModelAttribute("user") User user) {
		return "registration";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		if (!registerUserService.checkPasswordComarision(user.getPassword(), user.getConfirm_password())) {
			return "registration";
		}
		return "registration";
	}
}
