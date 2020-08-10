package com.rs.fer.service1;
import java.util.List;

import com.rs.fer.bean.Expense;
import com.rs.fer.bean.User;
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

public interface FERService {
RegistrationResponseVO registration(RegistrationRequestVO registrationRequestVO);
LoginResponseVO login(String userName,String password);
AddExpenseResponseVO addExpense(AddExpenseRequestVO addExpenseRequestVO);
boolean deleteExpense(int expenseId);
Expense getExpense(int expenseId);
List<Expense> getExpenses(int userId);

List<Expense> expenseReport(int userId,String type,String fromDate,String toDate);

User gerUser(int userId);
UpdateUserResponseVO updateUser(UpdateUserRequestVO updateUserRequestVO);
EditExpenseResponseVO editExpense(EditExpenseRequestVO editExpenseRequestVO);
ResetPasswordResponseVO resetPassword(ResetPasswordRequestVO resetReqVO);


	

}
