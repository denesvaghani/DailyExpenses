package app.dailyexpenses.service;

import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

	public boolean checkPasswordComarision(char[] userPassword, char[] userConfirmPassword) {

		if (!userPassword.equals(userConfirmPassword))
			return false;

		return true;
	}

}
