package Command;

import org.springframework.web.multipart.MultipartFile;

public class CandidatesCommand {
	String candidateNum;
	String candidateName;
	String candidateBirth;
	String candidateGender;
	String candidatePh;
	String candidateAddr;
	Integer auditionSeq;
	MultipartFile candidateVideo;
	
	public String getCandidateNum() {
		return candidateNum;
	}
	public void setCandidateNum(String candidateNum) {
		this.candidateNum = candidateNum;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getCandidateBirth() {
		return candidateBirth;
	}
	public void setCandidateBirth(String candidateBirth) {
		this.candidateBirth = candidateBirth;
	}
	public String getCandidateGender() {
		return candidateGender;
	}
	public void setCandidateGender(String candidateGender) {
		this.candidateGender = candidateGender;
	}
	public String getCandidatePh() {
		return candidatePh;
	}
	public void setCandidatePh(String candidatePh) {
		this.candidatePh = candidatePh;
	}
	public String getCandidateAddr() {
		return candidateAddr;
	}
	public void setCandidateAddr(String candidateAddr) {
		this.candidateAddr = candidateAddr;
	}
	public Integer getAuditionSeq() {
		return auditionSeq;
	}
	public void setAuditionSeq(Integer auditionSeq) {
		this.auditionSeq = auditionSeq;
	}
	public MultipartFile getCandidateVideo() {
		return candidateVideo;
	}
	public void setCandidateVideo(MultipartFile candidateVideo) {
		this.candidateVideo = candidateVideo;
	}
}
