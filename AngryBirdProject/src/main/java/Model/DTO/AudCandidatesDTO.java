package Model.DTO;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class AudCandidatesDTO implements Serializable {
	private AuditionDTO auditionDTO;
	private CandidateDTO candidateDTO;
	
	public AuditionDTO getAuditionDTO() {
		return auditionDTO;
	}
	public void setAuditionDTO(AuditionDTO auditionDTO) {
		this.auditionDTO = auditionDTO;
	}
	public CandidateDTO getCandidateDTO() {
		return candidateDTO;
	}
	public void setCandidateDTO(CandidateDTO candidateDTO) {
		this.candidateDTO = candidateDTO;
	}
}
