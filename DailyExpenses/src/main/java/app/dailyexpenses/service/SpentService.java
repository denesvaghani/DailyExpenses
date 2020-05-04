package app.dailyexpenses.service;

import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.dailyexpenses.dao.AddSpentDaoImpl;
import app.dailyexpenses.dto.AddSpentDTO;
import app.dailyexpenses.model.Spent;

@Service("spentService")
public class SpentService {
	@Autowired
	AddSpentDaoImpl addSpentDaoImpl;

	/*
	 * this method will add transfer Spent object to Dao layer it also map the
	 * Spent object with AddSpentDTO object
	 */
	public boolean addSpent(AddSpentDTO addSpent) {
		int idSpent = generateId();
		Spent spent = mapAddSpentDTOToSpentModel(idSpent, addSpent);
		if (addSpentDaoImpl.storeSpent(spent))
			return true;
		return false;
	}

	/*
	 * this will map AddSpentDTO object ot Spent model it takes id of spent and
	 * dto object returns Spent object
	 */
	public Spent mapAddSpentDTOToSpentModel(int idSpent, AddSpentDTO addSpent) {
		return new Spent(idSpent, addSpent.getSpentIn(), addSpent.getAmount(), addSpent.getDescription(),
				new Timestamp(System.currentTimeMillis()));
	}

	public int generateId() {
		return addSpentDaoImpl.getSpentId();
	}
}
