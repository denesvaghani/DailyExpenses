package app.dailyexpenses.dao;

import java.util.List;

import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;

public interface FetchTransactionsDao {
	public List<Earn> getEarn(int userid);
	public List<Spent> getSpent(int userid);
}
