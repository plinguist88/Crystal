package Controller.Login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.LoginCommand;

@Controller
public class LoginController {

	// 로그인 화면 가기
	@RequestMapping(value = "/login")
	public String goLogin(LoginCommand loginCommand) {

		return "login";
	}

}
