package com.rs.fer.main;

import java.util.List;

import com.rs.fer.bean.*;
//import com.rs.fer.service.*;
import com.rs.fer.service.impl.*;
import com.rs.fer.service1.*;
public class GetExpensesMain {
		public static void main(String[] args) {
			FERService ferService = new FERServiceImpl();
			int userId=1;
				List<Expense> getexpenses= ferService.getExpenses(userId);
			if(getexpenses!=null)
				System.out.println("data fetched sucessfully");
			else
				System.out.println("unable to fetch");
			
	}
}
