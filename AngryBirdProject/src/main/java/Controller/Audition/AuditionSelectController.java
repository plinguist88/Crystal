package Controller.Audition;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Service.Audition.AudSelectOneService;
import Service.Audition.AuditionSelectService;

@Controller
public class AuditionSelectController {
	@Autowired
	AuditionSelectService auditionSelectService;
	@Autowired
	AudSelectOneService audSelectOneService;
	

	//오디션 메인화면 (전체 오디션리스트)
	@RequestMapping(value="/audition", method = RequestMethod.GET)
	public String audition(Model model) {
		auditionSelectService.selectAuditionAll(model);
		return "audition/audition_list";
	}
	
	
	//오디션 상세내용
	@RequestMapping("/auditionDetail/{id}") 
	public String auditionDetail(@PathVariable("id") Integer auditionSeq, HttpSession session, Model model) { //requestParam은 <form>태그에서 name변수를 받을 때 사용하고, pathVariable은 쿼리스트링으로 값받을 떄 사용		
		//session 받아와서 audition 수정하기, 삭제하기 버튼은 직원에게만 보이도록 설정
		
		audSelectOneService.selectOne(auditionSeq, session, model);	
		return "audition/audition_detail"; 
		}
}
