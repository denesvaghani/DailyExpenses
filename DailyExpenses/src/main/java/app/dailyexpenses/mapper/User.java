package app.dailyexpenses.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import app.dailyexpenses.model.LoginForm;

public class User implements RowMapper<LoginForm> {

	@Override
	public LoginForm mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return null;
	}
	
}
