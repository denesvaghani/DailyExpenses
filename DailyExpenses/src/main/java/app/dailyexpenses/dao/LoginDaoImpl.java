package app.dailyexpenses.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.GeneratorStrategy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.dailyexpenses.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// validate user by checking user is exist in database and entered password matches with actual password.
	@Override
	public boolean validate(String userName, String password) {
		String fetchPassword = "select user_password from User where user_name=?";
		String passwordMatch = jdbcTemplate.queryForObject(fetchPassword, new Object[] { userName }, String.class);
		if (password.equals(passwordMatch)) {
			return true;
		}
		return false;
	}

	// it will return User object by fetching object from database
	@Override
	public User fetchUser(String userName) {
		User user;
		String fetchUser = "select * from User where user_name=?";
		user = jdbcTemplate.queryForObject(fetchUser, new Object[]{userName}, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(2),rs.getString(6),rs.getTimestamp(7));
				return user;
			}
			
		});
		return user;
	}

}
