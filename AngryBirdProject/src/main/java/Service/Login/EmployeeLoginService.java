package Service.Login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.LoginCommand;
import Encrypt.Encrypt;
import Model.DTO.EmployeeDTO;
import Model.DTO.EmployeeInfo;
import Repository.Employee.EmployeeRepository;

@Service
public class EmployeeLoginService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Integer employeeLogin(LoginCommand loginCommand, HttpSession session, HttpServletResponse response) {
		Integer result = null;
		
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeNum(loginCommand.getEmployeeNum() );
		employeeDTO = employeeRepository.employeeLogin(employeeDTO);
		// session값을 지니고 있는 class
		EmployeeInfo employeeInfo = null;
		if (employeeDTO == null) {
			result = 0;	// 아이디가 null일 경우
			
		} else {
			if (employeeDTO.getEmployeePw().equals(Encrypt.getEncryption(loginCommand.getEmployeePw() ) ) ) {
				
				employeeInfo = new EmployeeInfo(employeeDTO.getEmployeeNum(), employeeDTO.getEmployeeEmail(),
												employeeDTO.getEmployeeName(), employeeDTO.getEmployeePw() );
				session.setAttribute("employeeInfo", employeeInfo);
				
				setCookie(loginCommand, response);
				result = 1; // 비번을 비교 하여 로그인이 성공했을 경우
			
			} else {
				result = -1;
			}
		}
		return result;
	}
	
	public String employeeDepLogin (LoginCommand loginCommand, HttpSession session) {
		
		String depCheck = loginCommand.getEmployeeNum();
		
		String check = employeeRepository.employeeDepLogin(depCheck);
		
		session.setAttribute("employeeDepCheck", check);
		
		return check;
	}
	
	public void setCookie(LoginCommand loginCommand, HttpServletResponse response) {
		
		Cookie cookie = new Cookie("idStore", loginCommand.getEmployeeNum() );
		if (loginCommand.getIdStore() ) {
			
			cookie.setMaxAge(60 * 60 * 24 * 30); // 쿠키 수명
		} else {
			
			cookie.setMaxAge(0);
		}
		
		/*
		 * Cookie autoLoginCookie = new Cookie("autoLogin", loginCommand.getId1() ); if
		 * (loginCommand.getAutoLogin() ) { autoLoginCookie.setMaxAge(60 * 60 * 24 *
		 * 30); } response.addCookie(autoLoginCookie);
		 */
		response.addCookie(cookie);
		// addcookie는 사용자의 브라우져에 추가
	}
}
/*
 * <!-- css파일 접근시 --> <mvc:resources mapping="/resources/**"
 * location="/resources/" cache-period="31556926"/>
 */
