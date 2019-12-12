package Controller.Login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.LoginCommand;
import Service.Login.EmployeeLoginService;
import Validator.LoginCommandValidator;

@Controller
public class EmployeeLoginController {
	
	@Autowired
	private EmployeeLoginService employeeLoginService;
	
	// 직원 로그인
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String emplLogin(LoginCommand loginCommand, Errors errors, HttpSession session, HttpServletResponse response, Model model) {
		
		new LoginCommandValidator().validate(loginCommand, errors);
		if (errors.hasErrors() ) {
			return "login";
		}
		
		Integer result = employeeLoginService.employeeLogin(loginCommand, session, response);
		if (result == 0) {
			
			errors.rejectValue("employeeNum", "failId");
			return "login";
			
		} else if (result == -1){
			
			errors.rejectValue("employeePw", "failPw");
			return "login";
			
		}
		
		String resultDep = employeeLoginService.employeeDepLogin(loginCommand, session);
		
		System.out.println("Goooooooooood");
		return "main";
		
	}
	
	// get방식 접근 시 되돌아가기
	@RequestMapping(value = "/loginAction", method = RequestMethod.GET)
	public String emplLogin() {
		
		return "redirect:/main";
	}
}