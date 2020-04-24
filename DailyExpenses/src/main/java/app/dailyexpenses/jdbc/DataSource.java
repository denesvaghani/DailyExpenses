package app.dailyexpenses.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dataSource")
public class DataSource {

	DriverManager driverManager;

	public DriverManager getDriverManager() {
		return driverManager;
	}

	public void setDriverManager(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	public void setProperty(Driver driverClass, String url, String userName, String password)  {
		try {
			driverManager.registerDriver(driverClass);
			try {
				driverManager.getConnection(url, userName, password);
			}catch(SQLException e1) {
				System.out.println(" Connection is not established");
			}
		} catch (SQLException e) {
			System.out.println(" DriverClass is not register" + e);
		}
	}
}
