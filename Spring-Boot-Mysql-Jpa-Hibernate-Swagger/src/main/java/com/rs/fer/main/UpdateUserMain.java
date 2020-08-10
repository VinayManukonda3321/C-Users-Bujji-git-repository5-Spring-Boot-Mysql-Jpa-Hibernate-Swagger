package com.rs.fer.main;
import com.rs.fer.bean.Address;
import com.rs.fer.bean.User;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class UpdateUserMain {

	public static void main(String[] args) {
		User user = new User();
		user.setId(4);
		user.setFirstName("vani2");
		user.setLastName("kasi1");
		user.setEmail("vanicp@gmail.com");
		user.setMobile("9133232243");

		Address address = new Address();

		//address.setId(1);
		address.setLineOne("22");
		address.setLineTwo("bonpally");
		address.setCity("Hyabad");
		address.setPostal("5020082");
		address.setCountry("India1");
		address.setState("Telanga");
		address.setUserId(4);

		user.setAddress(address);
		FERService ferService = new FERServiceImpl();

		/*
		 * boolean isUpdateUser = ferService.updateUser(user); if (isUpdateUser)
		 * System.out.println("Updated Successfully"); else
		 * System.out.println("Updation failed");
		 */
	}

}
