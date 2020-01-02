package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TrainingTakeDTO implements Serializable {
	String trainingNum;
	String contractorId;
	
	public String getTrainingNum() {
		return trainingNum;
	}
	public void setTrainingNum(String trainingNum) {
		this.trainingNum = trainingNum;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
}
