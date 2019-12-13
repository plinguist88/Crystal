package Service.Candidates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.CandidateDTO;
import Repository.Candidates.CandidateRepository;

@Service
public class CandidateSelectService {
	@Autowired
	CandidateRepository candidateRepository;

	public void selectAll(Integer auditionSeq) {
		// TODO Auto-generated method stub
		List<CandidateDTO> candidates = candidateRepository.selectAllperAud(auditionSeq);
	}
}
