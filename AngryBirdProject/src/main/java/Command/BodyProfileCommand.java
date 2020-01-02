package Command;

public class BodyProfileCommand {
	private String contractorId;
	private String measureDate;
	private Integer weight;
	private Integer height;
	private Integer metabolism;
	private String gender;
	private Integer age; //안쓰이는 용도지만 view에서 에러 안나기 위해 생성
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getMeasureDate() {
		return measureDate;
	}
	public void setMeasureDate(String measureDate) {
		this.measureDate = measureDate;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getMetabolism() {
		return metabolism;
	}
	public void setMetabolism(Integer metabolism) {
		this.metabolism = metabolism;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	

}
