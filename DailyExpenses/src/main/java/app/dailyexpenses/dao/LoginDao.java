package app.dailyexpenses.dao;

import app.dailyexpenses.dto.UserRegistrationDTO;

public interface LoginDao {
	public void saveUser(UserRegistrationDTO user);
	public boolean validate(String userName, char[] password);
}
