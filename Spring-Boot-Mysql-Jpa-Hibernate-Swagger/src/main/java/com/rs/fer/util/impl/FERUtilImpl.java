package com.rs.fer.util.impl;

import org.springframework.stereotype.Component;

import com.rs.fer.bean.Address;
import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.util.FERUtil;

@Component
public class FERUtilImpl implements FERUtil{

	@Override
	public User loadUser(RegistrationRequestVO regReqVO) {
		User user = new User();
		
		user.setFirstName(regReqVO.getFirstName());
		user.setMiddleName(regReqVO.getMiddleName());
		user.setLastName(regReqVO.getLastName());
		user.setUserName(regReqVO.getUsername());
		user.setPassword(regReqVO.getPassword());
		user.setEmail(regReqVO.getEmail());
		user.setMobile(regReqVO.getMobile());
		
		user.setCreated(DateUtil.getCurrentDate());
		
		return user;
	}

	@Override
	public Expense loadExpense(AddExpenseRequestVO addReqVO) {
		
		Expense expense=new Expense();
		expense.setType(addReqVO.getType());
		expense.setDate(addReqVO.getDate());
		expense.setPrice(addReqVO.getPrice());
		expense.setNumberOfItems(addReqVO.getNumberOfItems());
		expense.setTotal(addReqVO.getTotal());
		expense.setByWhoom(addReqVO.getByWhoom());
		expense.setUserId(addReqVO.getUserId());
		
		expense.setCreated(DateUtil.getCurrentDate());
		
		return expense;
	}

	@Override
	public Expense loadExpense(EditExpenseRequestVO editReqVO) {
		Expense expense=new Expense();
		expense.setType(editReqVO.getType());
		expense.setDate(editReqVO.getDate());
		expense.setPrice(editReqVO.getPrice());
		expense.setNumberOfItems(editReqVO.getNumberOfItems());
		expense.setTotal(editReqVO.getTotal());
		expense.setByWhoom(editReqVO.getByWhoom());
		expense.setUserId(editReqVO.getUserId());
		
		expense.setUpdated(DateUtil.getCurrentDate());
		
		return expense;
	}

	@Override
	public User loadUser(ResetPasswordRequestVO resetReqVO) {
		User user=new User();
		ResetPasswordRequestVO resetReqVO1=new ResetPasswordRequestVO();
		resetReqVO1.getCurrentPassword();
		resetReqVO1.getNewPassword();
		user.setUpdated(DateUtil.getCurrentDate());
		
		return user;
	
	}

	@Override
	public User loadUser(UpdateUserRequestVO updateUserRequestVO) {
		User user = new User();
		
		user.setFirstName(updateUserRequestVO.getFirstName());
		user.setMiddleName(updateUserRequestVO.getMiddleName());
		user.setLastName(updateUserRequestVO.getLastName());
		user.setUserName(updateUserRequestVO.getUsername());
		user.setPassword(updateUserRequestVO.getPassword());
		user.setEmail(updateUserRequestVO.getEmail());
		user.setMobile(updateUserRequestVO.getMobile());
		user.setAddress(updateUserRequestVO.getAddress());		
		
		user.setUpdated(DateUtil.getCurrentDate());
		
		return user;

	
	}

}
