package app.dailyexpenses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dailyexpenses.dao.FetchTransactionDaoImpl;
import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;

@Service
public class FetchTransactionService {
	@Autowired
	FetchTransactionDaoImpl fetchTransactionDaoImpl;
	
	public List<Earn> getEarnList(int userid){
		List<Earn> earnList = fetchTransactionDaoImpl.getEarn(userid);
		return earnList;
	}
	
	public List<Spent> getSpentList(int userid){
		List<Spent> spentList = fetchTransactionDaoImpl.getSpent(userid);
		return spentList;
	}
}
