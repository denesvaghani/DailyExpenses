package app.dailyexpenses.dto;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class AddEarnDTO {
	private double amount;
	@NotBlank(message = "Enter name of user")
	@Pattern(regexp = "[a-zA-Z]", message = "enter name of user using a - z A - Z")
	private String recievedFrom;
	@NotBlank(message = "Enter description")
	@Pattern(regexp = "[a-zA-Z0-9.]", message = "enter description using a - z A - Z 0 - 9 .")
	private String description;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRecievedFrom() {
		return recievedFrom;
	}

	public void setRecievedFrom(String recievedFrom) {
		this.recievedFrom = recievedFrom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "AddEarnDTO [amount=" + amount + ", recievedFrom=" + recievedFrom + ", description=" + description + "]";
	}

	

}
