package Service.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CandidateDTO;
import Repository.Candidates.CandidateRepository;

@Service
public class CandidateSelectService {
	@Autowired
	CandidateRepository candidateRepository;

	public void selectAll(Integer auditionSeq, Model model) {
		// TODO Auto-generated method stub
		List<CandidateDTO> candidates = candidateRepository.selectAllperAud(auditionSeq);
		model.addAttribute("candidates", candidates);
	}

	public void candidateDetail(String candidateNum, Model model) {
		// TODO Auto-generated method stub
		CandidateDTO cdto = candidateRepository.oneCandidate(candidateNum);
		model.addAttribute("cdto", cdto);
	}
}
