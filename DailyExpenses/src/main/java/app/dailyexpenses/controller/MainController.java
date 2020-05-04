package app.dailyexpenses.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.dailyexpenses.dao.LoginDaoImpl;
import app.dailyexpenses.dto.AddSpentDTO;
import app.dailyexpenses.dto.LoginFormDTO;
import app.dailyexpenses.dto.UserRegistrationDTO;
import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;
import app.dailyexpenses.service.RegisterUserService;
import app.dailyexpenses.service.SpentService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	RegisterUserService registerUserService;
	@Autowired
	LoginDaoImpl loginDaoImpl;
	@Autowired
	SpentService spentService;

	@RequestMapping("/")
	public String showLogin(@ModelAttribute("loginForm") LoginFormDTO loginForm) {
		return "login";
	}

	@RequestMapping("/login")
	public String loginFormValidation(HttpServletRequest request,
			@Valid @ModelAttribute("loginForm") LoginFormDTO loginForm, BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		}
		if (!loginDaoImpl.validate(loginForm.getUserName(), loginForm.getPassword())) {
			return "login";
		}
		if (request.getSession(false) != null) {
			request.getSession().invalidate();
		}
		request.getSession().setAttribute("user", loginDaoImpl.fetchUser(loginForm.getUserName()));
		return "home";
	}

	@RequestMapping("/registration")
	public String showRegisterationPage(@ModelAttribute("user") UserRegistrationDTO user) {
		return "registration";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") UserRegistrationDTO user, BindingResult result) {

		if (result.hasErrors()) {
			return "registration";
		}
		if (!registerUserService.checkPasswordComarision(user.getPassword(), user.getConfirm_password())) {
			return "registration";
		}
		if (registerUserService.registerUser(user)) {
			return "home";
		}

		return "registration";
	}
	
	@RequestMapping(value = "/addSpentForm",method=RequestMethod.GET)
	public String showAddSpentForm( @Valid @ModelAttribute("spent") AddSpentDTO addSpent,
			BindingResult result) {
		return "addspentform";
	}

	@RequestMapping(value = "/addSpentForm/addSpent",method=RequestMethod.POST)
	public String addSpentOfUser( @Valid @ModelAttribute("spent") AddSpentDTO addSpent,
			BindingResult result) {
		spentService.addSpent(addSpent);

		return "login";
	}

}
