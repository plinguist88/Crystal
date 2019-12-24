package Command;

public class AuditionCommand {
	private String auditionTitle;
	private String auditionNum;
	private String startDate;	
	private String endDate;
	private String auditionType;
	private Integer auditionGather;
	private Integer auditionPassed;
	private String auditionContent;
	
	
	public String getAuditionTitle() {
		return auditionTitle;
	}
	public void setAuditionTitle(String auditionTitle) {
		this.auditionTitle = auditionTitle;
	}
	public String getAuditionNum() {
		return auditionNum;
	}
	public void setAuditionNum(String auditionNum) {
		this.auditionNum = auditionNum;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getAuditionType() {
		return auditionType;
	}
	public void setAuditionType(String auditionType) {
		this.auditionType = auditionType;
	}
	public Integer getAuditionGather() {
		return auditionGather;
	}
	public void setAuditionGather(Integer auditionGather) {
		this.auditionGather = auditionGather;
	}
	public String getAuditionContent() {
		return auditionContent;
	}
	public void setAuditionContent(String auditionContent) {
		this.auditionContent = auditionContent;
	}
	public Integer getAuditionPassed() {
		return auditionPassed;
	}
	public void setAuditionPassed(Integer auditionPassed) {
		this.auditionPassed = auditionPassed;
	}

}
