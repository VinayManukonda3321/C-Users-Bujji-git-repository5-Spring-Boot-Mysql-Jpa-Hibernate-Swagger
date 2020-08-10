package com.rs.fer.main;

import com.rs.fer.bean.User;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.response.RegistrationResponseVO;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class RegistrationMain {

	public static void main(String[] args) {

		FERService ferService = new FERServiceImpl();
		RegistrationRequestVO user = new RegistrationRequestVO();
		
		//user.setId(5);`
		user.setFirstName("abc");
		user.setLastName("abc");
		user.setEmail("abc.guntupalli1@gmail.com");
		user.setMobile("846496");
		user.setUsername("abc");
		user.setPassword("abc@89");

		RegistrationResponseVO isRegister = ferService.registration(user);
		if (isRegister != null)
			System.out.println("Registration successfull");
		else
			System.out.println("Try again");

	}

}

