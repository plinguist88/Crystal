package Controller.Candidates;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.CandidatesCommand;
import Service.Audition.AudSelectOneService;
import Service.Candidates.CandidateCheckService;
import Service.Candidates.CandidateRegisterService;

@Controller
public class CandidatesController {
	@Autowired
	CandidateRegisterService candidateRegisterService;
	@Autowired
	AudSelectOneService audSelectOneService;
	@Autowired
	CandidateCheckService candidateCheckService;
	
	//지원하기 버튼 누른 경우 지원자 등록 페이지로 가기
	@RequestMapping("/apply/{id}")
	public String apply(@PathVariable("id") Integer auditionSeq, CandidatesCommand candidatesCommand, Model model) {
		model.addAttribute("auditionSeq", auditionSeq);
		return "candidates/applyForm";
	}
	//지원자 참가신청하기
	@RequestMapping(value="/apply/register", method = RequestMethod.POST)
	public String register(CandidatesCommand candidatesCommand, HttpServletRequest request, Model model) {
		int result = candidateRegisterService.register(candidatesCommand, request, model);
		
		return "candidates/applyDone";
	}

	 //합격자 조회 페이지로 가기
	 @RequestMapping("/passedCheckGo") 
	 public String passedCheckGo() {
		 return "candidates/passedCheck"; 
	 }	
	
	 //합격자 조회하기
	 @RequestMapping("/passedCheck") 
	 public String check(@RequestParam(value="candidateNum") String candidateNum, Model model) {
		 candidateCheckService.checkPassed(candidateNum, model); 
		 return "candidates/passedCheck"; 
	 }
}
