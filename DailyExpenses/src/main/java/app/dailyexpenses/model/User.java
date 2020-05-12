package app.dailyexpenses.model;

import java.sql.Timestamp;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String userName;
	private String password;
	private Timestamp registrationTime;

	public User(Timestamp timestamp) {
		this.registrationTime = timestamp;
//		id++;
	}

	public User(int id,String firstName, String lastName, String phoneNumber, String userName, String password,
			Timestamp registrationTime) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		this.registrationTime = registrationTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(Timestamp registrationTime) {
		this.registrationTime = registrationTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", userName=" + userName + ", password=" + password + ", registrationTime=" + registrationTime + "]";
	}

}