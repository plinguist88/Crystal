package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CtContSupplyDTO implements Serializable{
	String ccNo;
	String ccDay;
	Integer ccPeriod;
	Integer ccExtention;
	String scNo;
	String employeeNum;
	
	public CtContSupplyDTO() {
		
	}

	public CtContSupplyDTO(String ccNo, String ccDay, Integer ccPeriod, Integer ccExtention, String scNo,
			String employeeNum) {
		this.ccNo = ccNo;
		this.ccDay = ccDay;
		this.ccPeriod = ccPeriod;
		this.ccExtention = ccExtention;
		this.scNo = scNo;
		this.employeeNum = employeeNum;
	}
	
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
	public String getCcDay() {
		return ccDay;
	}
	public void setCcDay(String ccDay) {
		this.ccDay = ccDay;
	}
	public Integer getCcPeriod() {
		return ccPeriod;
	}
	public void setCcPeriod(Integer ccPeriod) {
		this.ccPeriod = ccPeriod;
	}
	public Integer getCcExtention() {
		return ccExtention;
	}
	public void setCcExtention(Integer ccExtention) {
		this.ccExtention = ccExtention;
	}
	public String getScNo() {
		return scNo;
	}
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
