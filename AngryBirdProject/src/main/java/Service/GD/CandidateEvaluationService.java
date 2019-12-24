package Service.GD;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.EvalCommand;
import Model.DTO.CandidateDTO;
import Model.DTO.EmployeeInfo;
import Repository.Candidates.CandidateRepository;

@Service
public class CandidateEvaluationService {
	@Autowired
	CandidateRepository candidateRepository;

	public void evaluate(EvalCommand evalCommand, HttpSession session) {
		CandidateDTO cdto = new CandidateDTO();
		cdto.setCandidateNum(evalCommand.getCandidateNum());
		cdto.setVideoScore(evalCommand.getQ1());
		cdto.setDanceDiffScore(evalCommand.getQ2());
		cdto.setDanceStageScore(evalCommand.getQ3());
		cdto.setDanceRythmScore(evalCommand.getQ4());
		cdto.setSongChoiceScore(evalCommand.getQ5());
		cdto.setSongPitchScore(evalCommand.getQ6());
		cdto.setSongVibScore(evalCommand.getQ7());
		cdto.setAppScore(evalCommand.getQ8());
		cdto.setStrengthScore(evalCommand.getQ9());
		cdto.setGlobalScore(evalCommand.getQ10());
		cdto.setTotalScore(evalCommand.getEvalScore());
		
		System.out.println("CandidateNum()"+ cdto.getCandidateNum());
		System.out.println("VideoScore()"+ cdto.getVideoScore());
		System.out.println("DanceDiffScore()"+ cdto.getDanceDiffScore());
		System.out.println("DanceStageScore()"+ cdto.getDanceStageScore());
		System.out.println("DanceRythmScore()"+ cdto.getDanceRythmScore());
		System.out.println("SongChoiceScore()"+ cdto.getSongChoiceScore());
		System.out.println("SongPitchScore()"+ cdto.getSongPitchScore());
		System.out.println("SongVibScore()"+ cdto.getSongVibScore());
		System.out.println("AppScore()"+ cdto.getAppScore());
		System.out.println("StrengthScore()"+ cdto.getStrengthScore());
		System.out.println("GlobalScore()"+ cdto.getGlobalScore());
		System.out.println("TotalScore()"+ cdto.getTotalScore());
		
		//직원번호 
		EmployeeInfo employeeInfo = (EmployeeInfo) session.getAttribute("employeeInfo");

		System.out.println("EmployeeNum()"+ employeeInfo.getId());
		cdto.setEmployeeNum(employeeInfo.getId());
		
		candidateRepository.InsertEvaluation(cdto);
		
	}

}
