package Controller.Jumju;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.JumjuLoginCommand;
import Service.JumjuJoin.JumjuLoginService;
import Validator.JumjuLoginCommandValidator;

@Controller
public class JumjuLoginController {
	
	@Autowired
	JumjuLoginService jumjuLoginService;
	
	@RequestMapping(value = "/jumjuLogin", method = RequestMethod.GET)
	public String jumjuLogin (JumjuLoginCommand jumjuLoginCommand, @CookieValue(value = "jjIdStore", required = false) Cookie jjIdStore) {

		if (jjIdStore != null) {
			jumjuLoginCommand.setJjIdStore(true);
			jumjuLoginCommand.setId(jjIdStore.getValue() );
			
		}
		
		return "jumju/jumjuLoginForm";
	}

	/*@RequestMapping(value = "/jjLoginAction", method = RequestMethod.POST)
	public String jumjuLogin (JumjuLoginCommand jumjuLoginCommand,  
							  Errors errors, HttpSession session, HttpServletResponse response) {
		
		new JumjuLoginCommandValidator().validate(jumjuLoginCommand, errors);
		if (errors.hasErrors() ) {
			return "jumju/jumjuLoginForm";
			
		}
		
		Integer result = jumjuLoginService.jumjuLogin(jumjuLoginCommand, session, response);
		if (result == 0) {
			errors.rejectValue("id", "failId");
			return "jumju/jumjuLoginForm";
			
		} else if (result == -1) {
			errors.rejectValue("pw", "failPw");
			return "jumju/jumjuLoginForm";
			
		}
		
		System.out.println(jumjuLoginCommand.getId() + " : jjGoooooooood");
		return "main";
	}
	
	@RequestMapping(value = "/jjLoginAction", method = RequestMethod.GET)
	public String jumjuLogin () {
		
		return "main";
	}*/
}
