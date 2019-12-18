package Controller.Join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.JoinCommand;
import Service.Join.JoinService;
import Validator.JoinCommandValidator;

@Controller
public class JoinController {
	
	@Autowired
	JoinService joinService;

	// 가입 화면
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join (JoinCommand joinCommand, Model model) {
		joinService.dept(model);
		joinService.jopt(model);
		/*EmployeeInfo info = (EmployeeInfo)session.getAttribute("employeeInfo");
		if (info != null) {
			return "join/joinForm";
			
		} else {
			return "main";
			
		}*/
		
		return "join/joinForm";
		
	}
	
	// 가입 정보 처리
	@RequestMapping(value = "/joinAction", method = RequestMethod.POST)
	public String joinAction (JoinCommand joinCommand, Errors errors, Model model) {
		System.out.println(joinCommand.getEmployeeName() );
		
		joinService.dept(model);
		joinService.jopt(model);
		new JoinCommandValidator().validate(joinCommand, errors);
		if (errors.hasErrors() ) {
			
			return "join/joinForm";
		}
		Integer result = joinService.join(joinCommand);
		if (result == null) {
			
			errors.rejectValue("employeeNum", "duplicate");
			return "join/joinForm";
		}
		return "redirect:/main";
	}
	// 가입 정보 처리 되돌아가기
	@RequestMapping(value = "/joinAction", method = RequestMethod.GET)
	public String joinAction () {
		
		return "redirect:/main";
	}
	
	// 직원 가입 시 부서 가져오기
	/*@RequestMapping()
	public void detp () {
		
		joinService.dept();
	}*/
	
}
