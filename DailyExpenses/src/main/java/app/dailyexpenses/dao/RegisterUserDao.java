package app.dailyexpenses.dao;

import app.dailyexpenses.model.User;

public interface RegisterUserDao {
	public boolean registerUser(User user);
	public boolean checkUserName(String userName);
}
