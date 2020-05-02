package app.dailyexpenses.dto;

import java.util.Arrays;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class LoginFormDTO {

	@NotBlank(message = " * Username can not be null ")
	@Pattern(regexp = "^([A-Za-z0-9_])+$", message = " * Username must contains a-z A-z 0-9 and - only")
	private String userName;
	@NotBlank(message = " * Password can not be null ")
	private String password;

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

	@Override
	public String toString() {
		return "LoginFormDTO [userName=" + userName + ", password=" + password + "]";
	}

}
