package Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//잘못된 주소로 들어왔을때 차단 하는 용도
public class AuthCheckInterceptor extends HandlerInterceptorAdapter {	// 상속해야 함. 부모꺼를 가져옴으로 나를 확장 (오버라이드). 뒤에 Adapter는 다 클래스임. 
																		// Adapter가 빠진 인터페이스도 같은 기능을 하기는 함. 오버라이드 개수 차이 
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);	// session이 없을때만 인터셉터 하기 위해. false가 아니면 sesion이 만들어짐
		
		if (session != null) {
			Object authInfo = session.getAttribute("authInfo");
			
			if (authInfo != null) {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath() + "/main");
		return false;
	}
	
}
