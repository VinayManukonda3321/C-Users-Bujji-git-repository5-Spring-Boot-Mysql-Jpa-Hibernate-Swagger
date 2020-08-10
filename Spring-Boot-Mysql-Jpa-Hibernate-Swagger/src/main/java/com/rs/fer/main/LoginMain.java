package com.rs.fer.main;

import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class LoginMain {

	public static void main(String[] args) {

		FERService ferService = new FERServiceImpl();
		String userName = "swathi";
		String password = "swathi@89";

		LoginResponseVO isLogin = ferService.login(userName, password);

		if (isLogin != null) {
			System.out.println("login successfull");
		} else {
			System.out.println("login failed");
		}

	}

}
