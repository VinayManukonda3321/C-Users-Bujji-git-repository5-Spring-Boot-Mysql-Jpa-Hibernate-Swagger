package com.rs.fer.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ResetPasswordRequestVO {

	@Setter
	@Getter
	private String currentPassword;

	@Setter
	@Getter
	private String password;

	
	
	@Setter
	@Getter
	private String newPassword;

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
