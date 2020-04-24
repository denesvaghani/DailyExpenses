package app.dailyexpenses.model;

import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.NotBlank;

public class Spent {
	private int idSpent;
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
