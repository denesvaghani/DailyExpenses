package app.dailyexpenses.model;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class Earn {
	private int idEarn;
	@NotBlank(message = " * Enter Amount")
	@Min(value = 0, message = " * Value must be more than 0")
	private double amount;
	@NotBlank(message = " * Please Enter Description")
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
