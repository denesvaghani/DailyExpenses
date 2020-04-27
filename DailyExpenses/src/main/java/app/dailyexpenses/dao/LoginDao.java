package app.dailyexpenses.dao;

import app.dailyexpenses.model.User;

public interface LoginDao {
	public void saveUser(User user);
	public boolean validate(String userName, String password);
}
