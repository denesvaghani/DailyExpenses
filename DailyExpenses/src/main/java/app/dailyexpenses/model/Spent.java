package app.dailyexpenses.model;

import java.sql.Timestamp;

public class Spent {

	private int userid;
	private int idSpent;
	private String spentIn;
	private double amount;
	private String description;
	private Timestamp spentTimeStamp;
	
	public Spent(int userid, int idSpent, String spentIn, double amount, String description, Timestamp spentTimeStamp) {
		super();
		this.userid = userid;
		this.idSpent = idSpent;
		this.spentIn = spentIn;
		this.amount = amount;
		this.description = description;
		this.spentTimeStamp = spentTimeStamp;
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

	public int getIdSpent() {
		return idSpent;
	}

	public void setIdSpent(int idSpent) {
		this.idSpent = idSpent;
	}

	public String getSpentIn() {
		return spentIn;
	}

	public void setSpentIn(String spentIn) {
		this.spentIn = spentIn;
	}

	public Timestamp getSpentTimeStamp() {
		return spentTimeStamp;
	}

	public void setSpentTimeStamp(Timestamp spentTimeStamp) {
		this.spentTimeStamp = spentTimeStamp;
	}

	@Override
	public String toString() {
		return "Spent [idSpent=" + idSpent + ", spentIn=" + spentIn + ", amount=" + amount + ", description="
				+ description + ", spentTimeStamp=" + spentTimeStamp + "]";
	}

}
