package Controller.Audition;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.AuditionCommand;
import Service.Audition.AudSelectOneService;
import Service.Audition.AuditionInsertService;
import Service.Audition.AuditionSelectService;

@Controller
public class AuditionController {
	@Autowired
	AuditionInsertService auditionInsertService;
	@Autowired
	AuditionSelectService auditionSelectService;
	@Autowired
	AudSelectOneService audSelectOneService;
	
	//오디션 메인화면 (오디션리스트)
	@RequestMapping(value="/audition", method = RequestMethod.GET)
	public String audition(Model model) {
		auditionSelectService.selectAuditionAll(model);
		return "audition/audition_list";
	}
	
	//오디션공고 업로드페이지로 가기 + session값 필요
	@RequestMapping("/goAudition")
	public String goAudition(AuditionCommand auditionCommand) {
		return "audition/audition_upload";
	}
	
	//오디션 공고 등록하기 버튼 클릭시
	@RequestMapping(value="/registerAudition", method = RequestMethod.POST)
	public String registerAudition(AuditionCommand auditionCommand, HttpSession session) {
		auditionInsertService.regAudition(auditionCommand, session);
		return "redirect:/audition";
	}
	

	//오디션 상세내용
	@RequestMapping("/auditionDetail/{id}") 
	public String auditionDetail(@PathVariable("id") Integer auditionSeq, HttpSession session, Model model) { //requestParam은 <form>태그에서 name변수를 받을 때 사용하고, pathVariable은 쿼리스트링으로 값받을 떄 사용		
		//session 받아와서 audition 수정하기, 삭제하기 버튼은 직원에게만 보이도록 설정
		
		audSelectOneService.selectOne(auditionSeq, session, model);	
		return "audition/audition_detail"; 
		}
}
