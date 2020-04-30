package app.dailyexpenses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.dailyexpenses.model.User;

@Repository
public class RegisterUserDaoImpl implements RegisterUserDao {

	@Autowired
	JdbcTemplate jdbcTemplete;

	/*
	 * it takes User objects check that username is already present or not via
	 * checkUserName() if not present then it will insert the data to the
	 * database
	 */
	@Override
	public boolean registerUser(User user) {

		if (!checkUserName(user.getUserName())) {
			String storeUser = "INSERT INTO User ( user_name, user_first_name, user_last_name, user_office_phone, user_password,user_registratiion) VALUES (?, ?, ?, ?, ?, ?)";
			int row = jdbcTemplete.update(storeUser, user.getUserName(), user.getFirstName(),
					user.getLastName(), user.getPhoneNumber(), user.getPassword(), user.getRegistrationTime());
			if (row > 0)
				return true;
		}
		return false;
	}

	/*
	 * check username is present or not if present then value of isTaken = 1 if
	 * not present value of isTaken = 0
	 */
	public boolean checkUserName(String userName) {
		String fetchUser = " select count(*) from User where user_name = ?";
		int isTaken = jdbcTemplete.queryForObject(fetchUser, new Object[] { userName }, Integer.class);
		
		if (isTaken == 1)
			return true;
		return false;
	}
}
