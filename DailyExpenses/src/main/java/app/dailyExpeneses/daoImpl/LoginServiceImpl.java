package app.dailyExpeneses.daoImpl;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import app.dailyexpenses.dao.loginService;
import app.dailyexpenses.model.LoginForm;

public class LoginServiceImpl implements loginService {


	private DataSource dataSource;
	private JdbcTemplate jdbcTemplet ;


	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplet = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean checkRegistration(LoginForm loginForm) {
		String query = "Select username from user where username = ?";
		
		
		return false;
	}

	@Override
	public boolean checkValidation() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

}
