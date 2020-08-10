package com.rs.fer.request;

import javax.persistence.Column;

import com.rs.fer.bean.Address;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class UpdateUserRequestVO {

		
	@Setter
	@Getter
	private String firstName;
	@Setter
	@Getter
	private String middleName;
	@Setter
	@Getter
	private String lastName;
	@Setter
	@Getter
	private String username;
	@Setter
	@Getter
	private String password;

	@Setter
	@Getter
	private String email;
	@Setter
	@Getter
	private String mobile;
	/*
	 * @Setter
	 * 
	 * @Getter private int id;
	 * 
	 * 
	 * @Setter
	 * 
	 * @Getter private String lineOne;
	 * 
	 * @Setter
	 * 
	 * @Getter private String lineTwo;
	 * 
	 * @Setter
	 * 
	 * @Getter private String city;
	 * 
	 * @Setter
	 * 
	 * @Getter private String state;
	 * 
	 * @Setter
	 * 
	 * @Getter private String postal;
	 * 
	 * @Setter
	 * 
	 * @Getter private String country;
	 * 
	 * @Setter
	 * 
	 * @Getter private int userId;
	 */
	@Setter
	@Getter
	public Address address;

	public String getFirstName() {
		return firstName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * public void setId(int id) { this.id = id; } public int getId() { return id; }
	 * 
	 * public String getLineOne() { return lineOne; }
	 * 
	 * public void setLineOne(String lineOne) { this.lineOne = lineOne; }
	 * 
	 * 
	 * public String getLineTwo() { return lineTwo; }
	 * 
	 * public void setLineTwo(String lineTwo) { this.lineTwo = lineTwo; }
	 * 
	 * public String getCity() { return city; }
	 * 
	 * public void setCity(String city) { this.city = city; }
	 * 
	 * public String getState() { return state; }
	 * 
	 * public void setState(String state) { this.state = state; }
	 * 
	 * public String getPostal() { return postal; }
	 * 
	 * public void setPostal(String postal) { this.postal = postal; }
	 * 
	 * public String getCountry() { return country; }
	 * 
	 * public void setCountry(String country) { this.country = country; }
	 * 
	 * public int getUserId() { return userId; }
	 * 
	 * public void setUserId(int userId) { this.userId = userId; }
	 */
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
