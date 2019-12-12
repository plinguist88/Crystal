package Controller.Logout;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Logout.LogoutService;

@Controller
public class LogoutController {

	@Autowired
	LogoutService logoutService;
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		logoutService.logout(session);
		
		return "redirect:main";
	}
}
