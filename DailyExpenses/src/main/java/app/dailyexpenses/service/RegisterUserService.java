package app.dailyexpenses.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dailyexpenses.dao.RegisterUserDaoImpl;
import app.dailyexpenses.dto.UserRegistrationDTO;
import app.dailyexpenses.model.User;

@Service("registerUserService")
public class RegisterUserService {

	@Autowired
	RegisterUserDaoImpl registerUserDaoImpl;

	/*
	 * This method check whether password and confirm password are same or not
	 * this is server side validation of password and confirm password
	 */
	public boolean checkPasswordComarision(String userPassword, String userConfirmPassword) {

		if (!userPassword.equals(userConfirmPassword))
			return false;

		return true;
	}

	/*
	 * this method will convert userDto to user object using mapUserDtoToUser()
	 * then perform registration process using registerUser() of
	 * registerUserDaoImpl
	 */
	public boolean registerUser(UserRegistrationDTO user) {

		User newUser = mapUserDtoToUser(user);

		if (registerUserDaoImpl.registerUser(newUser))
			return true;

		return false;
	}

	/*
	 * This will map object UserRegistrationDTO object to User
	 */
	private User mapUserDtoToUser(UserRegistrationDTO user) {
		User newUser = new User(new Timestamp(System.currentTimeMillis()));
		newUser.setFirstName(user.getFirstName());
		newUser.setLastName(user.getLastName());
		newUser.setPassword(user.getPassword());
		newUser.setPhoneNumber(user.getPhoneNumber());
		newUser.setUserName(user.getUserName());
		return newUser;
	}

}
