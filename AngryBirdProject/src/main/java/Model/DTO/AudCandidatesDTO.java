package Model.DTO;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class AudCandidatesDTO implements Serializable {
	private AuditionDTO auditionDTO;
	private List<CandidateDTO> candidateDTOs;
	public AuditionDTO getAuditionDTO() {
		return auditionDTO;
	}
	public void setAuditionDTO(AuditionDTO auditionDTO) {
		this.auditionDTO = auditionDTO;
	}
	public List<CandidateDTO> getCandidateDTOs() {
		return candidateDTOs;
	}
	public void setCandidateDTOs(List<CandidateDTO> candidateDTOs) {
		this.candidateDTOs = candidateDTOs;
	}
}
