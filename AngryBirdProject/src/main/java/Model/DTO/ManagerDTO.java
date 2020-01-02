package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ManagerDTO implements Serializable{
	private String employeeNum;
	private String managerCelebrity;
	
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
