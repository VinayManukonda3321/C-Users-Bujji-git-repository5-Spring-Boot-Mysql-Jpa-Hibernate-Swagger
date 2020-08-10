package com.rs.fer.util.validation;

import java.util.Set;

import com.rs.fer.bean.Expense;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;

public interface FERValidation {

	Set<String> validateRegistrationRequest(RegistrationRequestVO registrationRequestVO);
	Set<String> validateAddExpenseRequest(AddExpenseRequestVO addExpenseRequestVO);
	Set<String> validateLoginRequest(LoginRequestVO loginRequestVO);
	Set<String> validateEditExpenseRequest(EditExpenseRequestVO editExpenseRequestVO);
	Set<String> validateEditExpenseRequest(ResetPasswordRequestVO resetPasswordRequestVO);
	Set<String> validateUpdateUserRequest(UpdateUserRequestVO updateUserRequestVO);
	Set<String> validateDeleteExpenseRequest(Expense expenseId);
	
}
