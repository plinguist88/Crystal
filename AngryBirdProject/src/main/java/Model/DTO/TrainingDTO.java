package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TrainingDTO implements Serializable{
	String trainingNum;
	String trainingLevel;
	String trainingStartDate;
	String trainingEndDate;
	String trainingCurriculum;
	
	public String getTrainingNum() {
		return trainingNum;
	}
	public void setTrainingNum(String trainingNum) {
		this.trainingNum = trainingNum;
	}
	public String getTrainingLevel() {
		return trainingLevel;
	}
	public void setTrainingLevel(String trainingLevel) {
		this.trainingLevel = trainingLevel;
	}
	public String getTrainingStartDate() {
		return trainingStartDate;
	}
	public void setTrainingStartDate(String trainingStartDate) {
		this.trainingStartDate = trainingStartDate;
	}
	public String getTrainingEndDate() {
		return trainingEndDate;
	}
	public void setTrainingEndDate(String trainingEndDate) {
		this.trainingEndDate = trainingEndDate;
	}
	public String getTrainingCurriculum() {
		return trainingCurriculum;
	}
	public void setTrainingCurriculum(String trainingCurriculum) {
		this.trainingCurriculum = trainingCurriculum;
	}
}
