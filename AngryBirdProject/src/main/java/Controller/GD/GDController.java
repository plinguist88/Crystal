package Controller.GD;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.EvalCommand;
import Service.Audition.AuditionSelectService;
import Service.Candidates.CandidateSelectService;
import Service.GD.CandidateEvaluationService;
import Service.GD.CandidatePassedService;

@Controller
public class GDController {
	@Autowired
	AuditionSelectService auditionSelectService;
	@Autowired
	CandidateSelectService candidateSelectService;
	@Autowired
	CandidateEvaluationService candidateEvaluationService;
	@Autowired
	CandidatePassedService candidatePassedService;
	
	//진행중인 오디션 보기
	@RequestMapping("/candidates")
	public String ongoingAudList(Model model) {
		auditionSelectService.selectAuditionForGD(model);
		return "geniusDevelopment/ongoingAuditions";
	}
	
	//오디션별 지원자 보기
	@RequestMapping("/showCandidates/{id}")
	public String show(@PathVariable("id") Integer auditionSeq, Model model) {
		candidateSelectService.selectAll(auditionSeq, model);
		return "geniusDevelopment/showCandidates";
	}
	
	//지원자 상세보기 
	@RequestMapping("/candidateDetail/{id}")
	public String show(@PathVariable("id") String candidateNum, EvalCommand evalCommand, Model model) { 
		//로딩할 때에는 command 사용하지 않지만, 만약 다음페이지로 넘어가다가 다시 detail 돌아올 때는 임시저장했던 데이터들을 다시 view로 불러올 때 command 사용되기 때문에 단순 로딩하는 경우에도 써줘야함
		candidateSelectService.candidateDetail(candidateNum, model);
		return "geniusDevelopment/candidateEvaluate";
	}
	//지원자 평가하기로 가기
	@RequestMapping("/evaluationSheet")
	public String evaluate() {
		return "geniusDevelopment/evaluationSheet";
	}	
	
	
	//지원자 평가 저장
	 @RequestMapping("/evaluationRegister") 
	 public String evaluate(EvalCommand evalCommand, HttpSession session) {
		 candidateEvaluationService.evaluate(evalCommand, session); 
		 return "redirect:showCandidates/"+ evalCommand.getAuditionSeq(); 
	 }
	 
	 
	 //합격자 저장
	 @RequestMapping("/goPass") 
	 public String goPass(@RequestParam(value="passedCan") String[] passedCan) {
		 candidatePassedService.savePassed(passedCan); 
		 return "redirect:candidates"; 
	 }
	 
	 
}
