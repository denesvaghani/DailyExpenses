package app.dailyexpenses.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.dailyexpenses.model.User;
import app.dailyexpenses.util.HibernateUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
		} catch (Exception e) {
			System.out.println("Error in storing the user " + e);
			if (transaction != null)
				transaction.rollback();
		}
	}

	@Override
	public boolean validate(String userName, String password) {
		Transaction transaction = null;
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
		//	session.createQuery(object);
			
		}
		return false;
	}

}
