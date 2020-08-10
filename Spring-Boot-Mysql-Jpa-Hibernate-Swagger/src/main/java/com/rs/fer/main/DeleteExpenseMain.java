package com.rs.fer.main;

import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class DeleteExpenseMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		//int id=4;
		boolean isDeleted=ferService.deleteExpense(4);
		
		if (isDeleted) 
			System.out.println("Expense deleted successfully");
		 else 
			System.out.println("Expense deletion failed");
		

			}
}
