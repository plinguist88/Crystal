package Controller.GD;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.Audition.AuditionSelectService;
import Service.Candidates.CandidateSelectService;

@Controller
public class GDController {
	@Autowired
	AuditionSelectService auditionSelectService;
	@Autowired
	CandidateSelectService candidateSelectService;
	
	//진행중인 오디션 보기
	@RequestMapping("/candidates")
	public String ongoingAudList(Model model) {
		auditionSelectService.selectAuditionForGD(model);
		return "geniusDevelopment/ongoingAuditions";
	}
	
	//오디션별 지원자 보기
	@RequestMapping("/showCandidates/{id}")
	public String show(@PathVariable("id") Integer auditionSeq, HttpSession session, Model model) {
		candidateSelectService.selectAll(auditionSeq);
		return "geniusDevelopment/candidateList";
	}
}
