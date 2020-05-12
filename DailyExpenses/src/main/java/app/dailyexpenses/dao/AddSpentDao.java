package app.dailyexpenses.dao;


import app.dailyexpenses.model.Spent;


public interface AddSpentDao {
	public int getSpentId();
	public boolean storeSpent(Spent spent);
}
