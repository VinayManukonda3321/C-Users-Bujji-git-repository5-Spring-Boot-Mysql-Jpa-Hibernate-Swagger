package com.rs.fer.main;

import com.rs.fer.bean.User;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class GetUserMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		int userId=1;
		User userdata=ferService.gerUser(userId);
		if(userdata!=null)
			System.out.println("user data fetched");
		else
			System.out.println("unable to fetch");
	
	}

}
