package com.rs.fer.main;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class GetExpenseMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		int expenseId=3;
		Expense getexpense=ferService.getExpense(expenseId);
		if(getexpense!=null)
			System.out.println("data fetched sucessfully");
		else
			System.out.println("unable to fetch");
		
		
	}
}
