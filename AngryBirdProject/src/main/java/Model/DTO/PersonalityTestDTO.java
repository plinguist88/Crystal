package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PersonalityTestDTO implements Serializable{
	private String personalityTestNum;
	private String personalityTestNo1;
	private String personalityTestNo2;
	private String personalityTestNo3;
	private String personalityTestNo4;
	private String personalityTestNo5;
	private String personalityTestNo6;
	private String personalityTestNo7;
	private String personalityTestNo8;
	private String personalityTestNo9;
	private String personalityTestNo10;
	private String personalityTestType;
	private String managerYearGrade;
	private String contractorActGrade;
	private String contractorId;
	private String employeeNum;
	
	public PersonalityTestDTO(String personalityTestNum, String personalityTestNo1, String personalityTestNo2,
			String personalityTestNo3, String personalityTestNo4, String personalityTestNo5, String personalityTestNo6,
			String personalityTestNo7, String personalityTestNo8, String personalityTestNo9, String personalityTestNo10,
			String personalityTestType, String managerYearGrade, String contractorActGrade, String contractorId,
			String employeeNum) {
		super();
		this.personalityTestNum = personalityTestNum;
		this.personalityTestNo1 = personalityTestNo1;
		this.personalityTestNo2 = personalityTestNo2;
		this.personalityTestNo3 = personalityTestNo3;
		this.personalityTestNo4 = personalityTestNo4;
		this.personalityTestNo5 = personalityTestNo5;
		this.personalityTestNo6 = personalityTestNo6;
		this.personalityTestNo7 = personalityTestNo7;
		this.personalityTestNo8 = personalityTestNo8;
		this.personalityTestNo9 = personalityTestNo9;
		this.personalityTestNo10 = personalityTestNo10;
		this.personalityTestType = personalityTestType;
		this.managerYearGrade = managerYearGrade;
		this.contractorActGrade = contractorActGrade;
		this.contractorId = contractorId;
		this.employeeNum = employeeNum;
	}

	public String getPersonalityTestNum() {
		return personalityTestNum;
	}

	public void setPersonalityTestNum(String personalityTestNum) {
		this.personalityTestNum = personalityTestNum;
	}

	public String getPersonalityTestNo1() {
		return personalityTestNo1;
	}

	public void setPersonalityTestNo1(String personalityTestNo1) {
		this.personalityTestNo1 = personalityTestNo1;
	}

	public String getPersonalityTestNo2() {
		return personalityTestNo2;
	}

	public void setPersonalityTestNo2(String personalityTestNo2) {
		this.personalityTestNo2 = personalityTestNo2;
	}

	public String getPersonalityTestNo3() {
		return personalityTestNo3;
	}

	public void setPersonalityTestNo3(String personalityTestNo3) {
		this.personalityTestNo3 = personalityTestNo3;
	}

	public String getPersonalityTestNo4() {
		return personalityTestNo4;
	}

	public void setPersonalityTestNo4(String personalityTestNo4) {
		this.personalityTestNo4 = personalityTestNo4;
	}

	public String getPersonalityTestNo5() {
		return personalityTestNo5;
	}

	public void setPersonalityTestNo5(String personalityTestNo5) {
		this.personalityTestNo5 = personalityTestNo5;
	}

	public String getPersonalityTestNo6() {
		return personalityTestNo6;
	}

	public void setPersonalityTestNo6(String personalityTestNo6) {
		this.personalityTestNo6 = personalityTestNo6;
	}

	public String getPersonalityTestNo7() {
		return personalityTestNo7;
	}

	public void setPersonalityTestNo7(String personalityTestNo7) {
		this.personalityTestNo7 = personalityTestNo7;
	}

	public String getPersonalityTestNo8() {
		return personalityTestNo8;
	}

	public void setPersonalityTestNo8(String personalityTestNo8) {
		this.personalityTestNo8 = personalityTestNo8;
	}

	public String getPersonalityTestNo9() {
		return personalityTestNo9;
	}

	public void setPersonalityTestNo9(String personalityTestNo9) {
		this.personalityTestNo9 = personalityTestNo9;
	}

	public String getPersonalityTestNo10() {
		return personalityTestNo10;
	}

	public void setPersonalityTestNo10(String personalityTestNo10) {
		this.personalityTestNo10 = personalityTestNo10;
	}

	public String getPersonalityTestType() {
		return personalityTestType;
	}

	public void setPersonalityTestType(String personalityTestType) {
		this.personalityTestType = personalityTestType;
	}

	public String getManagerYearGrade() {
		return managerYearGrade;
	}

	public void setManagerYearGrade(String managerYearGrade) {
		this.managerYearGrade = managerYearGrade;
	}

	public String getContractorActGrade() {
		return contractorActGrade;
	}

	public void setContractorActGrade(String contractorActGrade) {
		this.contractorActGrade = contractorActGrade;
	}

	public String getContractorId() {
		return contractorId;
	}

	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
