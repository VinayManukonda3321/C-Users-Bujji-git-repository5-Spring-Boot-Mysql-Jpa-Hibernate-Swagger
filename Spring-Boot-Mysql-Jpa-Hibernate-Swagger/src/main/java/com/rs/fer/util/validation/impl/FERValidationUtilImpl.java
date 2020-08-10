package com.rs.fer.util.validation.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.rs.fer.bean.Address;
import com.rs.fer.bean.Expense;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.request.LoginRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.util.validation.FERValidation;

@Component
public class FERValidationUtilImpl implements FERValidation {

	@Override
	public Set<String> validateRegistrationRequest(RegistrationRequestVO regReqVO) {

		Set<String> errorMessages = new LinkedHashSet<String>();

		errorMessages = validateProperty(errorMessages, regReqVO.getFirstName(), "Please enter FirstName");
		errorMessages = validateProperty(errorMessages, regReqVO.getLastName(), "Please enter LastName");
		errorMessages = validateProperty(errorMessages, regReqVO.getUsername(), "Please enter Username");
		errorMessages = validateProperty(errorMessages, regReqVO.getPassword(), "Please enter Password");
		errorMessages = validateProperty(errorMessages, regReqVO.getEmail(), "Please enter Email");
		errorMessages = validateProperty(errorMessages, regReqVO.getMobile(), "Please enter Mobile");

		return errorMessages;
	}

	public Set<String> validateProperty(Set<String> errorMessages, String value, String errorMessage) {

		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		}

		return errorMessages;
	}

	@Override
	public Set<String> validateAddExpenseRequest(AddExpenseRequestVO addReqVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();

		errorMessages = validateProperty1(errorMessages, addReqVO.getType(), "Please enter type");
		errorMessages = validateProperty1(errorMessages, addReqVO.getDate(), "Please enter date");
		
		errorMessages = validateProperty1(errorMessages, addReqVO.getPrice(), "Please enter price");
		errorMessages = validateProperty1(errorMessages, addReqVO.getNumberOfItems(), "Please enter number of items");
		errorMessages = validateProperty1(errorMessages, addReqVO.getTotal(), "Please enter total");
		errorMessages = validateProperty1(errorMessages, addReqVO.getByWhoom(), "Please enter byWhom");
		errorMessages = validateProperty1(errorMessages, addReqVO.getUserId(), "Please enter userid");

		return errorMessages;

	}

	private Set<String> validateProperty1(Set<String> errorMessages, Object value, String errorMessage) {
		if (StringUtils.isEmpty(value)) {
			errorMessages.add(errorMessage);
		} else if ((value.getClass().equals(Integer.class))&& Integer.parseInt(value.toString()) <= 0) {
			errorMessages.add(errorMessage);
		}
			else if (((value.getClass().equals(Integer.class)) && (Integer.parseInt(value.toString()) != (1-9)))) {
				errorMessages.add(errorMessage);
		
		}
		return errorMessages;
	}

	@Override
	public Set<String> validateLoginRequest(LoginRequestVO loginRequestVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();
		errorMessages = validateProperty(errorMessages, loginRequestVO.getUsername(), "Please enter UserName");
		errorMessages = validateProperty(errorMessages, loginRequestVO.getPassword(), "Please enter Password");

		return errorMessages;

	}

	@Override
	public Set<String> validateEditExpenseRequest(EditExpenseRequestVO editReqVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();

		errorMessages = validateProperty1(errorMessages, editReqVO.getType(), "Please enter type");
		errorMessages = validateProperty1(errorMessages, editReqVO.getDate(), "Please enter date");
		errorMessages = validateProperty1(errorMessages, editReqVO.getPrice(), "Please enter price");
		errorMessages = validateProperty1(errorMessages, editReqVO.getNumberOfItems(), "Please enter number of items");
		errorMessages = validateProperty1(errorMessages, editReqVO.getTotal(), "Please enter total");
		errorMessages = validateProperty1(errorMessages, editReqVO.getByWhoom(), "Please enter byWhom");
		errorMessages = validateProperty1(errorMessages, editReqVO.getUserId(), "Please enter userid");

		return errorMessages;
	}

	@Override
	public Set<String> validateEditExpenseRequest(ResetPasswordRequestVO resetPasswordRequestVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();
		errorMessages = validateProperty1(errorMessages, resetPasswordRequestVO.getCurrentPassword(), "Please enter current password");
		errorMessages = validateProperty1(errorMessages, resetPasswordRequestVO.getNewPassword(), "Please enter new Password");

		return errorMessages;

	
	
	}

	@Override
	public Set<String> validateUpdateUserRequest(UpdateUserRequestVO updateUserRequestVO) {
		Set<String> errorMessages = new LinkedHashSet<String>();
		Address address=new Address();

		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getFirstName(), "Please enter FirstName");
		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getLastName(), "Please enter LastName");
		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getUsername(), "Please enter Username");
		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getPassword(), "Please enter Password");
		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getEmail(), "Please enter Email");
		errorMessages = validateProperty1(errorMessages, updateUserRequestVO.getMobile(), "Please enter Mobile");
		errorMessages = validateProperty1(errorMessages, address.getLineOne(), "Please enter Line1");		
		errorMessages = validateProperty1(errorMessages, address.getLineOne(), "Please enter Line1");
		errorMessages = validateProperty1(errorMessages, address.getLineTwo(), "Please enter Line2");
		errorMessages = validateProperty1(errorMessages, address.getCity(), "Please enter city");
		errorMessages = validateProperty1(errorMessages, address.getState(), "Please enter state");
		errorMessages = validateProperty1(errorMessages, address.getPostal(), "Please enter postal");
		errorMessages = validateProperty1(errorMessages, address.getCountry(), "Please enter country");
		errorMessages = validateProperty1(errorMessages, address.getUserId(), "Please enter userId");
		errorMessages = validateProperty1(errorMessages, address.getId(), "Please enter id");
		
		return errorMessages;

	}

	@Override
	public Set<String> validateDeleteExpenseRequest(Expense expenseId) {
		Expense expense=new Expense();
		Set<String> errorMessages = new LinkedHashSet<String>();
		errorMessages = validateProperty1(errorMessages, expense.getId(), "Please enter valid id");
		
		return errorMessages;
	}

}
