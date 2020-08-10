package com.rs.fer.main;
import com.rs.fer.bean.Expense;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.response.AddExpenseResponseVO;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class AddExpenseMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		AddExpenseRequestVO expense = new AddExpenseRequestVO();
		
		//expense.setId();
		expense.setType("grocery");
		expense.setPrice(100);
		expense.setNumberOfItems(10);
		expense.setTotal(1000);
		expense.setDate("25/5/2018");
		expense.setByWhoom("swathi");
		expense.setUserId(3);

		AddExpenseResponseVO isAdded = ferService.addExpense(expense);

		if (isAdded != null)
			System.out.println("Expense Addedd successfully");
		else
			System.out.println("Expense not added");

	}

}
