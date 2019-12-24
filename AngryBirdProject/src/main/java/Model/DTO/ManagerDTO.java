package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ManagerDTO implements Serializable{
	private String employeeNum;
	private String managerCelebrity;
	
	public ManagerDTO(String employeeNum, String managerCelebrity) {
		super();
		this.employeeNum = employeeNum;
		this.managerCelebrity = managerCelebrity;
	}
	
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getManagerCelebrity() {
		return managerCelebrity;
	}
	public void setManagerCelebrity(String managerCelebrity) {
		this.managerCelebrity = managerCelebrity;
	}
}
