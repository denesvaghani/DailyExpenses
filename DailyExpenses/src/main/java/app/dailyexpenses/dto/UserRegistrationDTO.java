package app.dailyexpenses.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "User")
public class UserRegistrationDTO {

	@NotBlank(message = "please fill this value")
	@Pattern(regexp = "[a-zA-Z]+$", message = "only alphabat accepted")
	@Size(min = 2, max = 20, message = "Length should between 2 to 20")
	private String firstName;

	@NotBlank(message = "please fill this value")
	@Pattern(regexp = "[a-zA-Z]+$", message = "only alphabat accepted")
	@Size(min = 2, max = 20, message = "Length should between 2 to 20")
	private String lastName;

	@NotBlank(message = "please fill this value")
	@Size(min = 10, max = 10, message = "It should be 10 digit")
	@Pattern(regexp = "[0-9]+$", message = "Only Digits accepted")
	private String phoneNumber;

	@NotBlank(message = "please fill this value")
	@Size(min = 2, max = 20, message = "It should have length 2 to 20 digit")
	@Pattern(regexp = "[a-zA-Z0-9_.]+$+$", message = "Only Digits accepted")
	private String userName;

	@NotBlank(message = "please fill this value")
	@Size(min = 5, max = 20, message = "Length should between 5 to 20")
	private String password;

	@NotBlank(message = "please fill this value")
	@Size(min = 5, max = 20, message = "Length should between 5 to 20")
	private String confirm_password;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getConfirm_password() {
		return confirm_password;
	}

	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [ firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", userName=" + userName + ", password=" + (password) + ", confirm_password=" + (confirm_password)
				+ "]";
	}

}
