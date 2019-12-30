package Service.ContractorLogin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.LoginCommand;
import Encrypt.Encrypt;
import Model.DTO.ContractorDTO;
import Model.DTO.ContractorInfo;
import Model.DTO.EmployeeInfo;
import Repository.Contractor.ContractorRepository;

@Service
public class ContractorLoginService {
	@Autowired
	ContractorRepository contractorRepository;

	public Integer contractorLogin(LoginCommand loginCommand, HttpSession session, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int result = 0;
		
		//Contractor ID가 DB에 존재하는지 조회
		ContractorDTO cdto = new ContractorDTO();		
		String contractorId = loginCommand.getEmployeeNum();
		cdto = contractorRepository.selectOneContractor(contractorId);
		
		
		// contractor의 session을 담을 객체
		ContractorInfo contractorInfo = null;
		
		if (cdto == null) {
			result = 0;	// 아이디가 null일 경우
			
		} else {
			if (cdto.getContractorPw().equals(Encrypt.getEncryption(loginCommand.getEmployeePw())   ) ) {
				
				contractorInfo = new ContractorInfo(cdto.getContractorId(), cdto.getContractorPw(), cdto.getContractorName(), cdto.getContractorLevel() );
				session.setAttribute("contractorInfo", contractorInfo);
				
				setCookie(loginCommand, response);
				result = 1; // 비번을 비교 하여 로그인이 성공했을 경우
			
			} else {
				result = -1;
			}
		}
		return result;
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
