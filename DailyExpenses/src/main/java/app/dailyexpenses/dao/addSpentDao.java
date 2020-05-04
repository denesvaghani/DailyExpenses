package app.dailyexpenses.dao;

import app.dailyexpenses.model.Spent;

public interface addSpentDao {
	public int getSpentId();
	public boolean storeSpent(Spent spent);
}
