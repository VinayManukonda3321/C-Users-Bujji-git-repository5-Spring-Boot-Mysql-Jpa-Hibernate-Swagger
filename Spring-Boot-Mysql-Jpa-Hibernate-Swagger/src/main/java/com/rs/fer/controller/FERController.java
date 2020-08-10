
package com.rs.fer.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
import com.rs.fer.request.AddExpenseRequestVO;
import com.rs.fer.request.EditExpenseRequestVO;
import com.rs.fer.request.LoginRequestVO;
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
import com.rs.fer.util.validation.FERValidation;

@RestController
public class FERController {

	@Autowired
	private FERService ferService;

	@Autowired
	private FERValidation ferValidation;

	@PostMapping("/registration")
	public RegistrationResponseVO registration(@ModelAttribute RegistrationRequestVO registrationRequestVO) {
		Set<String> errorMessages = ferValidation.validateRegistrationRequest(registrationRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new RegistrationResponseVO(HttpStatus.PRECONDITION_REQUIRED, "999", "", errorMessages);
		} else {
			return ferService.registration(registrationRequestVO);
		}
	}

	@GetMapping("/login")
	public LoginResponseVO login(@ModelAttribute LoginRequestVO loginRequestVO) {
		Set<String> errorMessages = ferValidation.validateLoginRequest(loginRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new LoginResponseVO(HttpStatus.PRECONDITION_FAILED, "999", "", errorMessages);
		} else
			return ferService.login(loginRequestVO.getUsername(), loginRequestVO.getPassword());
	}

	@PostMapping("/expense")
	public AddExpenseResponseVO addExpense(@ModelAttribute AddExpenseRequestVO addExpenseRequestVO) {
		Set<String> errorMessages = ferValidation.validateAddExpenseRequest(addExpenseRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new AddExpenseResponseVO(HttpStatus.PRECONDITION_REQUIRED, "999", "", errorMessages);
		} else {
			return ferService.addExpense(addExpenseRequestVO);
		}

	}

	@PutMapping("/expense")
	public EditExpenseResponseVO editExpense(@ModelAttribute EditExpenseRequestVO editExpenseRequestVO) {
		Set<String> errorMessages = ferValidation.validateEditExpenseRequest(editExpenseRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new EditExpenseResponseVO(HttpStatus.PRECONDITION_REQUIRED, "999", "", errorMessages);
		} else {
			return ferService.editExpense(editExpenseRequestVO);
		}
	}

	@DeleteMapping("/expense/{id}")
	public String deleteExpense(@PathVariable("id") int id) {
		boolean isDeleted = ferService.deleteExpense(id);
		return (isDeleted ? "Expense deleted successfully" : "Expense delete failed");
	}

	@GetMapping("/expense/{id}")
	public Expense getExpense(@PathVariable("id") int id) {
		return ferService.getExpense(id);
	}

	@GetMapping("/expenses/{userid}")
	public List<Expense> getExpenses(@PathVariable("userid") int userid) {
		return ferService.getExpenses(userid);
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int id) {
		return ferService.gerUser(id);
	}

	@PutMapping("/user")
	public UpdateUserResponseVO udateUser(@ModelAttribute UpdateUserRequestVO updateUserRequestVO) {
		Set<String> errorMessages = ferValidation.validateUpdateUserRequest(updateUserRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new UpdateUserResponseVO(HttpStatus.PRECONDITION_REQUIRED, "999", "", errorMessages);
		} else {
			return ferService.updateUser(updateUserRequestVO);
		}
	}
	@PutMapping("/user/resetpassword/{id}")

	public ResetPasswordResponseVO resetPassword(@PathVariable((String) "id") int userid,
			@ModelAttribute ResetPasswordRequestVO resetPasswordRequestVO) {
		Set<String> errorMessages = ferValidation.validateEditExpenseRequest(resetPasswordRequestVO);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new ResetPasswordResponseVO(HttpStatus.PRECONDITION_REQUIRED, "999", "", errorMessages);
		} else {
			return ferService.resetPassword(resetPasswordRequestVO);

		}
	}

	@GetMapping("/expensereport/{userid}")
	public List<Expense> getExpenseReport(@PathVariable("userid") int userid, @RequestParam String type,
			@RequestParam String fromDate, @RequestParam String toDate) {
		return ferService.expenseReport(userid, type, fromDate, toDate);
	}

}
