package com.rs.fer.main;

import java.util.*;

import com.rs.fer.bean.Expense;
import com.rs.fer.service.impl.FERServiceImpl;
import com.rs.fer.service1.FERService;

public class ExpenseReportMain {
	public static void main(String[] args) {
		FERService ferService = new FERServiceImpl();
		int userId=1;
		String type="clothes";
		String fromDate="25/5/2016"; 
		String toDate="26/5/2020";
		List<Expense> expenseReport=ferService.expenseReport(userId, type, fromDate, toDate);
		if(expenseReport!=null)
			System.out.println("Report of the expense fetched");
		else
			System.out.println("Unable to fetch expense report");
			
	}

}
