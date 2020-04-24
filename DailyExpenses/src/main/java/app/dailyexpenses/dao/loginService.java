package app.dailyexpenses.dao;

import app.dailyexpenses.model.LoginForm;

public interface loginService {
	
	/*
	 * check user is registered with
	 * the web application or not
	 */
	public boolean checkRegistration(LoginForm loginForm);
	
	/*
	 * map username and password 
	 */
	public boolean checkValidation();
	
	
	/*
	 * perform login service
	 */
	public boolean login();
	
	
}
