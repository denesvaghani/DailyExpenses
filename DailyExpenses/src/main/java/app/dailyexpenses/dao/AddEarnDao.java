package app.dailyexpenses.dao;

import app.dailyexpenses.model.Earn;


public interface AddEarnDao {
	public int getEarnId();

	public boolean storeEarn(Earn Earn);
}
