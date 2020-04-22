package app.dailyexpenses.model;

public class Earn {
	private int idEarn;
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

	public int getIdEarn() {
		return idEarn;
	}

	public void setIdEarn(int idEarn) {
		this.idEarn = idEarn;
	}

	@Override
	public String toString() {
		return "Spent [idEarn=" + idEarn + ", amount=" + amount + ", description=" + description + "]";
	}

}
