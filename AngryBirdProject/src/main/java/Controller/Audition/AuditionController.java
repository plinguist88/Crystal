package Controller.Audition;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.AuditionCommand;
import Service.Audition.AuditionInsertService;
import Service.Audition.AuditionSelectService;

@Controller
public class AuditionController {
	@Autowired
	AuditionInsertService auditionInsertService;
	@Autowired
	AuditionSelectService auditionSelectService;
	
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
	
	/*
	 * //오디션 상세내용
	 * 
	 * @RequestMapping("/auditionDetail") public String
	 * auditionDetail(@RequestParam()) { return "audition/audition_detail"; }
	 */
}
