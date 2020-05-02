package app.dailyexpenses.dao;

import app.dailyexpenses.model.User;

public interface LoginDao {
	
	public boolean validate(String userName, String password);
	public User fetchUser(String userName);
	
}
