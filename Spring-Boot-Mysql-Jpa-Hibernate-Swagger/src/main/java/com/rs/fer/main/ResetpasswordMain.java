package com.rs.fer.main;

import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class ResetpasswordMain {

	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		int userId=1;
		String newPassword="swathi@91";
		String currentPassword="swathi@89";
		/*ResetPasswordRequestVO isResetPassword=ferService.resetPassword(userId, currentPassword, newPassword);
			//	resetPassword(userId, currentPassword, newPassword);
		if (isResetPassword != null) 
			System.out.println("Password Reset successful");
		 else 
			System.out.println("Password Reset Failed");
		
			}
*/
}
}
