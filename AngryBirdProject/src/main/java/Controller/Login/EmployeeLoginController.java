package Controller.Login;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.LoginCommand;
import Service.ContractorLogin.ContractorLoginService;
import Service.Login.EmployeeLoginService;
import Validator.LoginCommandValidator;

@Controller
public class EmployeeLoginController {
	
	@Autowired
	private EmployeeLoginService employeeLoginService;
	
	@Autowired
	private ContractorLoginService contractorLoginService;
	
	
	// 직원 로그인
	@RequestMapping(value = "/loginAction", method = RequestMethod.POST)
	public String emplLogin(LoginCommand loginCommand, Errors errors, HttpSession session, HttpServletResponse response, Model model) {
		
		
		//계약자 Contractor 로그인
		if(loginCommand.getEmployeeNum().substring(0, 1).equals("C")) {
			
			//validator
			new LoginCommandValidator().validate(loginCommand, errors);
			if (errors.hasErrors() ) {
				return "login";
			}
			
			//계약자 로그
			Integer result = contractorLoginService.contractorLogin(loginCommand, session, response);
			if (result == 0) {
				
				errors.rejectValue("employeeNum", "failId");
				return "login";
				
			} else if (result == -1){
				
				errors.rejectValue("employeePw", "failPw");
				return "login";
				
			}
			
			System.out.println("Contractooooooooooooooor");
			return "main";
		}
		
		
		
		//직원 로그인
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
		
		System.out.println("Goooooooooood");
		return "main";
		
	}
	
	// get방식 접근 시 되돌아가기
	@RequestMapping(value = "/loginAction", method = RequestMethod.GET)
	public String emplLogin() {
		
		return "redirect:/main";
	}
}