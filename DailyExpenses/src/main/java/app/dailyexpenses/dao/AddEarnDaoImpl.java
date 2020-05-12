package app.dailyexpenses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import app.dailyexpenses.model.Earn;

@Repository
public class AddEarnDaoImpl implements AddEarnDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	/*
	 * method is used to get last id is used to store last record
	 */
	@Override
	public int getEarnId() {
		String getId = " select count(*) from earn where 1 ";
		int id = jdbcTemplate.queryForObject(getId, Integer.class);
		return id;
	}
	
	/*
	 * store earn to the database
	 * uses earn model object 
	 * it return true if persistence is successful
	 */
	@Override
	public boolean storeEarn(Earn earn) {
		String store = "INSERT INTO `earn` (`user_id`,`earn_id`, `earn_receivedFrom`, `earn_amount`, `earn_description`, `earn_timestamp`) VALUES (?,?, ?, ?, ?, ?);";
		int result = jdbcTemplate.update(store, new Object[] {earn.getUserid(), earn.getIdEarn(), earn.getRecievedFrom(),
				earn.getAmount(), earn.getDescription(), earn.getEarnTimeStamp() });
		if (result >= 1)
			return true;
		return false;
	}

}
