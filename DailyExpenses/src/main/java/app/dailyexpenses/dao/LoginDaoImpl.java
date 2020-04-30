package app.dailyexpenses.dao;

import org.springframework.stereotype.Repository;

import app.dailyexpenses.dto.UserRegistrationDTO;


@Repository
public class LoginDaoImpl implements LoginDao {

	@Override
	public void saveUser(UserRegistrationDTO user) {
	
	}

	@Override
	public boolean validate(String userName, char[] password) {
		return false;
	
	}

}
