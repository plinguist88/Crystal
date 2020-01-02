package Service.JumjuJoin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.JumjuLoginCommand;
import Command.LoginCommand;
import Encrypt.Encrypt;
import Model.DTO.JumjuDTO;
import Model.DTO.JumjuInfo;
import Repository.Jumju.JumjuRepository;

@Service
public class JumjuLoginService {

	@Autowired
	private JumjuRepository jumjuRepository;
	
	public Integer jumjuLogin(LoginCommand loginCommand, HttpSession session,  HttpServletResponse response) {
		Integer result = null;
		JumjuInfo jumjuInfo = null;
		
		JumjuDTO jumjuDTO = new JumjuDTO();
		jumjuDTO.setStoreOwnerId(loginCommand.getEmployeeNum() );
		jumjuDTO = jumjuRepository.jumjuLogin(jumjuDTO);
		if (jumjuDTO == null) {
			result = 0;	// id가 null일 경우
			
		} else {
			if (jumjuDTO.getStoreOwnerPw().equals(Encrypt.getEncryption(loginCommand.getEmployeePw() ) ) ) {
				jumjuInfo = new JumjuInfo(jumjuDTO.getStoreOwnerId(), jumjuDTO.getStoreOwnerPw(), jumjuDTO.getStoreOwnerName(), 
										  jumjuDTO.getStoreOwnerPhone(), jumjuDTO.getStoreCodeNum() );
				session.setAttribute("jumjuInfo", jumjuInfo);
				setCookie(loginCommand, response);
				result = 1;
				
			} else {
				result = -1;
				
			}
		}
		return result;
	}
	
	// 로그인 시 id저장
	public void setCookie(LoginCommand loginCommand, HttpServletResponse response) {
		
		Cookie cookie = new Cookie("idStore", loginCommand.getEmployeeNum() );
		if (loginCommand.getIdStore() ) {
			cookie.setMaxAge(60 * 60 * 24 * 30); // 쿠키 수명
			
		} else {
			cookie.setMaxAge(0);
			
		}
		response.addCookie(cookie);
	}
}
