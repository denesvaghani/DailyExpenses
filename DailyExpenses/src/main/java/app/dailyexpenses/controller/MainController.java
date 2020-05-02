package app.dailyexpenses.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import app.dailyexpenses.dao.LoginDaoImpl;
import app.dailyexpenses.dto.LoginFormDTO;
import app.dailyexpenses.dto.UserRegistrationDTO;
import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;
import app.dailyexpenses.service.RegisterUserService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	RegisterUserService registerUserService;
	@Autowired
	LoginDaoImpl loginDaoImpl;

	@RequestMapping("/")
	public String showLogin(@ModelAttribute("loginForm") LoginFormDTO loginForm) {
		loginForm.setPassword("4514519");
		loginForm.setUserName("denes_4514519");
		return "login";
	}

	@RequestMapping("/login")
	public String loginFormValidation(HttpServletRequest request,@Valid @ModelAttribute("loginForm") LoginFormDTO loginForm,
			BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		} 
		if (!loginDaoImpl.validate(loginForm.getUserName(), loginForm.getPassword())) {
			return "login";
		}
		if(request.getSession(false) != null){
			request.getSession().invalidate();
		}
		request.getSession().setAttribute("user_name",loginDaoImpl.fetchUser(loginForm.getUserName()));
		return "home";
	}

	@RequestMapping(value = "/updatedExpenses", method = RequestMethod.POST)
	public String showUpdatedHomePage(@Valid @ModelAttribute("spent") Spent spent, BindingResult resultSpent,
			@Valid @ModelAttribute("earn") Earn earn, BindingResult resultEarn) {
		return "home";
	}

	@RequestMapping("/registration")
	public String showRegisterationPage(@ModelAttribute("user") UserRegistrationDTO user) {
		user.setConfirm_password("4514519");
		user.setFirstName("denes");
		user.setLastName("vaghani");
		user.setPassword("4514519");
		user.setPhoneNumber("7574992779");
		user.setUserName("denes_4514519");
		return "registration";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@Validated @ModelAttribute("user") UserRegistrationDTO user, BindingResult result) {

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
}
