package Controller.Login;

import javax.servlet.http.Cookie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.LoginCommand;

@Controller
public class LoginController {

	// 로그인 화면 가기
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String goLogin(LoginCommand loginCommand, @CookieValue(value = "idStore", required = false) Cookie idStore) {
		
		if (idStore != null) {
			loginCommand.setIdStore(true);
			loginCommand.setEmployeeNum(idStore.getValue() );
			
		}
		
		return "login";
	}

}
