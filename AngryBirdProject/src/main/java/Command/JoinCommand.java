package Command;

public class JoinCommand {

	private String employeeNum;
	private String employeeName;
	private String employeeEmail;
	private String employeePw;
	private String pwCon;
	private String employeePh;
	private Integer employeeHiredYrs;
	private String employeeHiredate;
	private String employeeGender;
	private String employeeBirth;
	private Integer employeeHeight;
	private Integer employeeWeight;
	private Integer employeeActive;
	private Integer employeeKcal;
	private String deptNum;
	private String jopTypeNum;
	
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeePw() {
		return employeePw;
	}
	public void setEmployeePw(String employeePw) {
		this.employeePw = employeePw;
	}
	public String getPwCon() {
		return pwCon;
	}
	public void setPwCon(String pwCon) {
		this.pwCon = pwCon;
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
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeBirth() {
		return employeeBirth;
	}
	public void setEmployeeBirth(String employeeBirth) {
		this.employeeBirth = employeeBirth;
	}
	public Integer getEmployeeHeight() {
		return employeeHeight;
	}
	public void setEmployeeHeight(Integer employeeHeight) {
		this.employeeHeight = employeeHeight;
	}
	public Integer getEmployeeWeight() {
		return employeeWeight;
	}
	public void setEmployeeWeight(Integer employeeWeight) {
		this.employeeWeight = employeeWeight;
	}
	public Integer getEmployeeActive() {
		return employeeActive;
	}
	public void setEmployeeActive(Integer employeeActive) {
		this.employeeActive = employeeActive;
	}
	public Integer getEmployeeKcal() {
		return employeeKcal;
	}
	public void setEmployeeKcal(Integer employeeKcal) {
		this.employeeKcal = employeeKcal;
	}
	public String getDeptNum() {
		return deptNum;
	}
	public void setDeptNum(String deptNum) {
		this.deptNum = deptNum;
	}
	public String getJopTypeNum() {
		return jopTypeNum;
	}
	public void setJopTypeNum(String jopTypeNum) {
		this.jopTypeNum = jopTypeNum;
	}
	
	public boolean pwEqualsPwcon() {
		
		if (pwCon.equals(employeePw) ) {
			return true;
		}
		return false;
	}
}
