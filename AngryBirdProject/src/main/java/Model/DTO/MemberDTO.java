package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberDTO implements Serializable{

	//private String employeeNum;
	
	private String employeeId;
	private String employeePassword;
	private String employeeName;
	private String employeeGender;
	private String employeeEmail;
	private String employeePh;
	private Integer employeeHiredYrs;
	private String employeeHiredate;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String employeeId, String employeePassword, String employeeName, String employeeGender,
			String employeeEmail, String employeePh, Integer employeeHiredYrs, String employeeHiredate) {
		super();
		this.employeeId = employeeId;
		this.employeePassword = employeePassword;
		this.employeeName = employeeName;
		this.employeeGender = employeeGender;
		this.employeeEmail = employeeEmail;
		this.employeePh = employeePh;
		this.employeeHiredYrs = employeeHiredYrs;
		this.employeeHiredate = employeeHiredate;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePh() {
		return employeePh;
	}
	public void setEmployeePh(String employeePh) {
		this.employeePh = employeePh;
	}
	public Integer getEmployeeHiredYrs() {
		return employeeHiredYrs;
	}
	public void setEmployeeHiredYrs(Integer employeeHiredYrs) {
		this.employeeHiredYrs = employeeHiredYrs;
	}
	public String getEmployeeHiredate() {
		return employeeHiredate;
	}
	public void setEmployeeHiredate(String employeeHiredate) {
		this.employeeHiredate = employeeHiredate;
	}
}