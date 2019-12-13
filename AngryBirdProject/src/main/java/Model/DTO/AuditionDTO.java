package Model.DTO;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class AuditionDTO implements Serializable{
	Integer auditionSeq;
	Integer auditionNo;
	String startDate;
	String endDate;
	Integer gather;
	Integer passed;
	String type;
	
	Timestamp uploadDate;
	String title;
	String content;
	String employeeNum;
	public Integer getAuditionSeq() {
		return auditionSeq;
	}
	public void setAuditionSeq(Integer auditionSeq) {
		this.auditionSeq = auditionSeq;
	}	
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public Integer getAuditionNo() {
		return auditionNo;
	}
	public void setAuditionNo(Integer auditionNo) {
		this.auditionNo = auditionNo;
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
	public Integer getGather() {
		return gather;
	}
	public void setGather(Integer gather) {
		this.gather = gather;
	}
	public Integer getPassed() {
		return passed;
	}
	public void setPassed(Integer passed) {
		this.passed = passed;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Timestamp uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
