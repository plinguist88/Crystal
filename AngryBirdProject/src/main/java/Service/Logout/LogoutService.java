package Service.Logout;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class LogoutService {

	public void logout(HttpSession session) {
		
		session.invalidate();
	}
}
