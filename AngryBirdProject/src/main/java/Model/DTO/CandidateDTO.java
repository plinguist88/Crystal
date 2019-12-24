package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class CandidateDTO implements Serializable{
	String candidateNum;
	String candidateName;
	String candidateBirth;
	String candidateGender;
	String candidatePh;
	String candidateAddr;
	Timestamp candidateDate;
	Integer auditionSeq;
	String originalFilename; 
	String storeFilename;
	Long fileSize;
	
	Integer videoScore;
	Integer danceDiffScore;
	Integer danceRythmScore;
	Integer danceStageScore;
	Integer songChoiceScore;
	Integer songPitchScore;
	Integer songVibScore;
	Integer appScore;
	Integer strengthScore;
	Integer globalScore;
	Integer totalScore;
	String employeeNum;
	Integer passed;
	
	AuditionDTO auditionDTO;
	
	
	public AuditionDTO getAuditionDTO() {
		return auditionDTO;
	}
	public void setAuditionDTO(AuditionDTO auditionDTO) {
		this.auditionDTO = auditionDTO;
	}
	
	
	public Integer getVideoScore() {
		return videoScore;
	}
	public void setVideoScore(Integer videoScore) {
		this.videoScore = videoScore;
	}
	public Integer getDanceDiffScore() {
		return danceDiffScore;
	}
	public void setDanceDiffScore(Integer danceDiffScore) {
		this.danceDiffScore = danceDiffScore;
	}
	public Integer getDanceRythmScore() {
		return danceRythmScore;
	}
	public void setDanceRythmScore(Integer danceRythmScore) {
		this.danceRythmScore = danceRythmScore;
	}
	public Integer getDanceStageScore() {
		return danceStageScore;
	}
	public void setDanceStageScore(Integer danceStageScore) {
		this.danceStageScore = danceStageScore;
	}
	public Integer getSongChoiceScore() {
		return songChoiceScore;
	}
	public void setSongChoiceScore(Integer songChoiceScore) {
		this.songChoiceScore = songChoiceScore;
	}
	public Integer getSongPitchScore() {
		return songPitchScore;
	}
	public void setSongPitchScore(Integer songPitchScore) {
		this.songPitchScore = songPitchScore;
	}
	public Integer getSongVibScore() {
		return songVibScore;
	}
	public void setSongVibScore(Integer songVibScore) {
		this.songVibScore = songVibScore;
	}
	public Integer getAppScore() {
		return appScore;
	}
	public void setAppScore(Integer appScore) {
		this.appScore = appScore;
	}
	public Integer getStrengthScore() {
		return strengthScore;
	}
	public void setStrengthScore(Integer strengthScore) {
		this.strengthScore = strengthScore;
	}
	public Integer getGlobalScore() {
		return globalScore;
	}
	public void setGlobalScore(Integer globalScore) {
		this.globalScore = globalScore;
	}
	public Integer getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}
	public Integer getAuditionSeq() {
		return auditionSeq;
	}
	public void setAuditionSeq(Integer auditionSeq) {
		this.auditionSeq = auditionSeq;
	}
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
	public String getOriginalFilename() {
		return originalFilename;
	}
	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}
	public String getStoreFilename() {
		return storeFilename;
	}
	public void setStoreFilename(String storeFilename) {
		this.storeFilename = storeFilename;
	}
	public Long getFileSize() {
		return fileSize;
	}
	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}
	public Timestamp getCandidateDate() {
		return candidateDate;
	}
	public void setCandidateDate(Timestamp candidateDate) {
		this.candidateDate = candidateDate;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public Integer getPassed() {
		return passed;
	}
	public void setPassed(Integer passed) {
		this.passed = passed;
	}
	
	
}
