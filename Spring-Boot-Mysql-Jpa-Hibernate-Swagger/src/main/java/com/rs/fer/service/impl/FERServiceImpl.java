package com.rs.fer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
import com.rs.fer.dao.AddressRepository;
import com.rs.fer.dao.ExpenseRepository;
import com.rs.fer.dao.UserRepository;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.request.RegistrationRequestVO;
import com.rs.fer.request.ResetPasswordRequestVO;
import com.rs.fer.request.UpdateUserRequestVO;
import com.rs.fer.response.AddExpenseResponseVO;
import com.rs.fer.response.EditExpenseResponseVO;
import com.rs.fer.response.LoginResponseVO;
import com.rs.fer.response.RegistrationResponseVO;
import com.rs.fer.response.ResetPasswordResponseVO;
import com.rs.fer.response.UpdateUserResponseVO;
import com.rs.fer.service1.FERService;
import com.rs.fer.util.FERUtil;

@Service
public class FERServiceImpl implements FERService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ExpenseRepository expenseRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private FERUtil ferUtil;

	public RegistrationResponseVO registration(RegistrationRequestVO regReqVO) {
		List<User> users = userRepository.findByEmail(regReqVO.getEmail());
		if (!CollectionUtils.isEmpty(users)) {
			return new RegistrationResponseVO(HttpStatus.OK, "002", "User email is already exist", null);
		}
		User user = ferUtil.loadUser(regReqVO);
		user = userRepository.save(user);
		if (user.getId() > 0) {
			return new RegistrationResponseVO(HttpStatus.OK, "000", "User is registered successfully", null);
		} else {
			return new RegistrationResponseVO(HttpStatus.OK, "001", "User registration is failed", null);
		}
	}

	@Override
	public LoginResponseVO login(String userName, String password) {
		List<User> users = userRepository.findByUserNameAndPassword(userName, password);
		if (!CollectionUtils.isEmpty(users))
			return new LoginResponseVO(HttpStatus.OK, "000", "User is valid", null);
		else
			return new LoginResponseVO(HttpStatus.OK, "001", "User is not valid", null);
	}

	@Override
	public AddExpenseResponseVO addExpense(AddExpenseRequestVO addReqVO) {
		Expense expense = ferUtil.loadExpense(addReqVO);
		expense = expenseRepository.save(expense);
		if (expense.getId() > 0) {
			return new AddExpenseResponseVO(HttpStatus.OK, "000", "Expense added successfully", null);
		} else {
			return new AddExpenseResponseVO(HttpStatus.OK, "001", "Expense not added", null);
		}
	}

	@Override
	public EditExpenseResponseVO editExpense(EditExpenseRequestVO editReqVO) {
		Expense expense = ferUtil.loadExpense(editReqVO);
		expense = expenseRepository.save(expense);
		if (expense.getId() > 0)
			return new EditExpenseResponseVO(HttpStatus.OK, "000", "Expense edited successfully", null);
		else
			return new EditExpenseResponseVO(HttpStatus.OK, "001", "Expense not edited", null);
	}

	@Override
	public boolean deleteExpense(int expenseId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResetPasswordResponseVO resetPassword(ResetPasswordRequestVO resetReqVO) {
		/*
		 * User user = ferUtil.loadUser(resetReqVO);
		 * 
		 * user = userRepository.save(user); if (user.getId() > 0) { return new
		 * ResetPasswordResponseVO(HttpStatus.OK, "000", "Password reset successfull",
		 * null); } else { return new ResetPasswordResponseVO(HttpStatus.OK, "001",
		 * "Password reset failed", null); }
		 * 
		 * 
		 */
		User user = ferUtil.loadUser(resetReqVO);

		if (resetReqVO.getPassword().equals(resetReqVO.getCurrentPassword())) {
			user.setPassword(resetReqVO.getCurrentPassword());
			userRepository.save(user);
			return new ResetPasswordResponseVO(HttpStatus.OK, "000", "Password reset successful", null);
		} else
			return new ResetPasswordResponseVO(HttpStatus.OK, "001", "Password reset failed", null);

	}

	@Override
	public Expense getExpense(int expenseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> getExpenses(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Expense> expenseReport(int userId, String type, String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User gerUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UpdateUserResponseVO updateUser(UpdateUserRequestVO updateUserRequestVO) {
		User user = ferUtil.loadUser(updateUserRequestVO);
		user = userRepository.save(user);
		if (user.getId() > 0)
			return new UpdateUserResponseVO(HttpStatus.OK, "000", "User updated successfully", null);
		else
			return new UpdateUserResponseVO(HttpStatus.OK, "001", "User not updated", null);
	}

}
