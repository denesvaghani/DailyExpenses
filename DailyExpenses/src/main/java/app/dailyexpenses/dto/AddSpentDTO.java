package app.dailyexpenses.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.NotBlank;

public class AddSpentDTO {

	@NotBlank(message = "please enter Amount")
	@Min(value = 1, message = "amount should be more than 0")
	private double amount;
	@NotBlank(message = "Enter name of user")
	@Pattern(regexp = "[a-zA-Z]", message = "enter name of user using a - z A - Z")
	private String spentIn;
	@NotBlank(message = "Enter description")
	@Pattern(regexp = "[a-zA-Z0-9.]", message = "enter description using a - z A - Z 0 - 9 .")
	private String description;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getSpentIn() {
		return spentIn;
	}

	public void setSpentIn(String spentIn) {
		this.spentIn = spentIn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AddSpentDTO [ amount=" + amount + ", spentIn=" + spentIn + ", description="
				+ description + "]";
	}

}
