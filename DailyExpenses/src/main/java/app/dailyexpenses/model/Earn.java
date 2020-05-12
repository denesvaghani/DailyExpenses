package app.dailyexpenses.model;

import java.sql.Timestamp;

public class Earn {

	private int userid;
	private int idEarn;
	private String recievedFrom;
	private double amount;
	private String description;
	private Timestamp earnTimeStamp;

	

	public Earn(int userid, int idEarn, String recievedFrom, double amount, String description,
			Timestamp spentTimeStamp) {
		this.userid = userid;
		this.idEarn = idEarn;
		this.recievedFrom = recievedFrom;
		this.amount = amount;
		this.description = description;
		this.earnTimeStamp = spentTimeStamp;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdEarn() {
		return idEarn;
	}

	public void setIdEarn(int idEarn) {
		this.idEarn = idEarn;
	}

	public String getRecievedFrom() {
		return recievedFrom;
	}

	public void setRecievedFrom(String recievedFrom) {
		this.recievedFrom = recievedFrom;
	}



	public Timestamp getEarnTimeStamp() {
		return earnTimeStamp;
	}

	public void setEarnTimeStamp(Timestamp earnTimeStamp) {
		this.earnTimeStamp = earnTimeStamp;
	}

	@Override
	public String toString() {
		return "Earn [userid=" + userid + ", idEarn=" + idEarn + ", recievedFrom=" + recievedFrom + ", amount=" + amount
				+ ", description=" + description + ", earnTimeStamp=" + earnTimeStamp + "]";
	}

	

}
