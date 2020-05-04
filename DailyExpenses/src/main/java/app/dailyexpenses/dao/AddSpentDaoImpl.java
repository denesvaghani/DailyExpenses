package app.dailyexpenses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.dailyexpenses.model.Spent;

@Repository("addSpentDaoImpl")
public class AddSpentDaoImpl implements addSpentDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	/*
	 * method is used to get last id is used to store last record
	 */
	@Override
	public int getSpentId() {
		String getId = " select count(*) from spent where 1 ";
		int id = jdbcTemplate.queryForObject(getId, Integer.class);
		return id;
	}

	/*
	 * store spent to the database
	 * uses spent model object 
	 * it return true if persistence is successful
	 */
	public boolean storeSpent(Spent spent) {
		String store = "INSERT INTO `spent` (`spent_id`, `spent_to`, `spent_amount`, `spent_description`, `spent_date`) VALUES (?, ?, ?, ?, ?)";
		int result = jdbcTemplate.update(store, new Object[] { spent.getIdSpent(), spent.getSpentIn(),
				spent.getAmount(), spent.getDescription(), spent.getSpentTimeStamp() });
		if (result >= 1)
			return true;
		return false;

	}

}
