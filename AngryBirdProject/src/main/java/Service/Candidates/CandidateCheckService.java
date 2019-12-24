package Service.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.AudCandidatesDTO;
import Model.DTO.CandidateDTO;
import Repository.Candidates.CandidateRepository;

@Service
public class CandidateCheckService {
	@Autowired
	CandidateRepository candidateRepository;

	public void checkPassed(String candidateNum, Model model) {
		// TODO Auto-generated method stub
		
		AudCandidatesDTO audC = candidateRepository.checkPassed(candidateNum);
		
		model.addAttribute("audC", audC);
		
	}

}
