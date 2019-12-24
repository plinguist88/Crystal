package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GradesManagerDTO implements Serializable{
	private String managerYearGrade;
	private Long category1;
	private Long category2;
	
	public GradesManagerDTO(String managerYearGrade, Long category1, Long category2) {
		super();
		this.managerYearGrade = managerYearGrade;
		this.category1 = category1;
		this.category2 = category2;
	}

	public String getManagerYearGrade() {
		return managerYearGrade;
	}

	public void setManagerYearGrade(String managerYearGrade) {
		this.managerYearGrade = managerYearGrade;
	}

	public Long getCategory1() {
		return category1;
	}

	public void setCategory1(Long category1) {
		this.category1 = category1;
	}

	public Long getCategory2() {
		return category2;
	}

	public void setCategory2(Long category2) {
		this.category2 = category2;
	}
}
