package app.dailyexpenses.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import app.dailyexpenses.model.Earn;
import app.dailyexpenses.model.Spent;

@Repository
public class FetchTransactionDaoImpl implements FetchTransactionsDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Earn> getEarn(int userid) {
		List<Earn> earn;
		String sql = "select * from earn where user_id=?";
		earn = jdbcTemplate.query(sql,new Object[]{userid},new RowMapper<Earn>(){

			@Override
			public Earn mapRow(ResultSet rs, int rowNum) throws SQLException {
				Earn earn = new Earn(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getTimestamp(6));
				return earn;
			}
			
		});
		return earn;
	}

	@Override
	public List<Spent> getSpent(int userid) {
		List<Spent> spent;
		String sql = "select * from spent where user_id=?";
		spent = jdbcTemplate.query(sql,new Object[]{userid},new RowMapper<Spent>(){

			@Override
			public Spent mapRow(ResultSet rs, int rowNum) throws SQLException {
				Spent spent = new Spent(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getDouble(4),rs.getString(5),rs.getTimestamp(6));
				return spent;
			}
			
		});
		System.out.println(spent);
		return spent;
	}

}
