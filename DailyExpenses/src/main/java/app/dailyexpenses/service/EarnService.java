package app.dailyexpenses.service;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dailyexpenses.dao.AddEarnDaoImpl;
import app.dailyexpenses.dto.AddEarnDTO;
import app.dailyexpenses.model.Earn;

@Service
public class EarnService {
	@Autowired
	AddEarnDaoImpl addEarnDao;

	/*
	 * this method will add transfer Earn object to Dao layer it also map the
	 * Earn object with AddEarnDTO object
	 */
	public boolean addEarn(AddEarnDTO addEarn, int userid) {
		int idEarn = generateId();
		Earn earn = mapAddEarnDTOToEarnModel(idEarn, addEarn,userid);
		if (addEarnDao.storeEarn(earn))
			return true;
		return false;
	}

	/*
	 * this will map AddEarnDTO object to Earn model it takes id of earn and dto
	 * object returns earn object
	 */
	public Earn mapAddEarnDTOToEarnModel(int idEarn, AddEarnDTO addEarn,int userid) {
		return new Earn(userid,idEarn, addEarn.getRecievedFrom(), addEarn.getAmount(), addEarn.getDescription(),
				new Timestamp(System.currentTimeMillis()));
	}

	public int generateId() {
		return (addEarnDao.getEarnId()+1);
	}
}
