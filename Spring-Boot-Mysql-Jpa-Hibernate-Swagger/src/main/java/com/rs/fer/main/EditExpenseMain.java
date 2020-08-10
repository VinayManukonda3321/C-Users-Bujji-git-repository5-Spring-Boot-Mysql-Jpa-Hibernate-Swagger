
package com.rs.fer.main;

import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.response.EditExpenseResponseVO;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class EditExpenseMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		EditExpenseRequestVO expense = new EditExpenseRequestVO();

		expense.setType("gold");
		expense.setPrice(15000);
		expense.setNumberOfItems(1);
		expense.setTotal(15000);
		expense.setDate("12/6/2019");
		expense.setByWhoom("suma");
		expense.setUserId(4);
		//expense.setUserId(2);

		EditExpenseResponseVO isAdded = ferService.editExpense(expense);

		if (isAdded != null)
			System.out.println("Expense updated successfully");
		else
			System.out.println("Expense updation failed");

	}
}
