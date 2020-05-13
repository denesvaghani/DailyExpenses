package app.dailyexpenses.dao;

import java.util.List;

import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;

public interface FetchTransactionsDao {
	/*
	 * Fetch all Earn Details from the 
	 * database using userId
	 */
	public List<Earn> getEarn(int userid);
	
	/*
	 * Fetch all Spent Details from the 
	 * database using userId
	 */
	public List<Spent> getSpent(int userid);
}
