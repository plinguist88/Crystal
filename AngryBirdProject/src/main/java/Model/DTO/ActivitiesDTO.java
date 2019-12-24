package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ActivitiesDTO implements Serializable {
	private String contractorId;
	private String activityName;
	private String activityStartdate;
	private String activityEnddate;
	
	public ActivitiesDTO(String contractorId, String activityName, String activityStartdate, String activityEnddate) {
		super();
		this.contractorId = contractorId;
		this.activityName = activityName;
		this.activityStartdate = activityStartdate;
		this.activityEnddate = activityEnddate;
	}

	public String getContractorId() {
		return contractorId;
	}

	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityStartdate() {
		return activityStartdate;
	}

	public void setActivityStartdate(String activityStartdate) {
		this.activityStartdate = activityStartdate;
	}

	public String getActivityEnddate() {
		return activityEnddate;
	}

	public void setActivityEnddate(String activityEnddate) {
		this.activityEnddate = activityEnddate;
	}
}
