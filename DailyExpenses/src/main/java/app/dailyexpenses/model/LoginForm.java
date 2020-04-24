package app.dailyexpenses.model;

import java.util.Arrays;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;

public class LoginForm {

	@NotBlank(message = " * Username can not be null ")
	@Size(min = 2, message = " * Username length must have 2 character long")
	@Pattern(regexp = "^(([A-Za-z])+([\\w{2,}]))+$", message = " * Username must contains a-z A-z 0-9 and - only")
	private String userName;

	private char[] password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [userName=" + userName + ", password=" + Arrays.toString(password) + "]";
	}

}
