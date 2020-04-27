package app.dailyexpenses.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import app.dailyexpenses.model.User;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties properties = new Properties();
				properties.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/DailyExpenses/");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "5656");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.SHOW_SQL, "true");
				properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				properties.put(Environment.HBM2DDL_AUTO, "update");

				configuration.setProperties(properties);
				configuration.addAnnotatedClass(User.class);

				sessionFactory = configuration.configure().buildSessionFactory();
				return sessionFactory;
			} catch (Exception e) {
				System.out.println("Error in connecting to database" + e);
			}

		}

		return sessionFactory;
	}
}
