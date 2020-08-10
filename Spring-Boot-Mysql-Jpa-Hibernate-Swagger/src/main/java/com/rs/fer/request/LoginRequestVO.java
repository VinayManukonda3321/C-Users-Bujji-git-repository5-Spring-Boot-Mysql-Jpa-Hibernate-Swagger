package com.rs.fer.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class LoginRequestVO {

	
	@Setter
	@Getter
	private String username;
	@Setter
	@Getter
	private String password;

	
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

	
}
