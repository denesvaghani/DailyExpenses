package app.dailyexpenses.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Spent {
	private int idSpent;
	private double amount;
	private String description;

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

	@Override
	public String toString() {
		return "Spent [idSpent=" + idSpent + ", amount=" + amount + ", description=" + description + "]";
	}

}
