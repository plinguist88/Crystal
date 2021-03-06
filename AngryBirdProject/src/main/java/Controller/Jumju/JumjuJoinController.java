package Controller.Jumju;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.JumjuJoinCommand;
import Model.DTO.EmployeeInfo;
import Service.JumjuJoin.JumjuJoinService;
import Validator.JumjuJoinCommandValidator;

@Controller
public class JumjuJoinController {

	@Autowired
	JumjuJoinService jumjuJoinService;
	
	// 점주 가입 페이지
	@RequestMapping(value = "/jumju")
	public String jjJoin (JumjuJoinCommand jumjuJoinCommand, HttpSession session) {
		
		EmployeeInfo info = (EmployeeInfo) session.getAttribute("employeeInfo");
		
		if (info != null) {
			return "jumju/jumjuJoinForm";
			
		} else {
			return "main";
			
		}
	}
	
	
	// 점주 가입 정보 처리
	@RequestMapping(value = "/jjJoinAction", method = RequestMethod.POST)
	public String jjJoinAction (JumjuJoinCommand jumjuJoinCommand, Errors errors) {
		System.out.println("jjID : " + jumjuJoinCommand.getStoreOwnerName() );
		
		new JumjuJoinCommandValidator().validate(jumjuJoinCommand, errors);
		if (errors.hasErrors()) {
			return "jumju/jumjuJoinForm";
			
		}
		
		Integer result = jumjuJoinService.jumjuJoinAction(jumjuJoinCommand);
		System.out.println("jjID : " + jumjuJoinCommand.getStoreOwnerId() );
		if (result == null) {
			errors.rejectValue("storeOwnerId", "duplicate");
			return "jumju/jumjuJoinForm";
		
		}
		
		return "main";
	}
	// 점주 가입 정보 처리 되돌아가기
	@RequestMapping(value = "/jjJoinAction", method = RequestMethod.GET)
	public String jjJoinAction () {
		
		return "redirect:/main";
	}
}
