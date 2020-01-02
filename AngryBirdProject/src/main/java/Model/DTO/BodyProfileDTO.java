package Model.DTO;

import java.io.Serializable;
import java.sql.Date;

@SuppressWarnings("serial")
public class BodyProfileDTO implements Serializable{
	private String contractorId;
	private String measureDate;
	private Date mDate; //sql에서 varchar2타입의 날짜를 date로 변환한 값을 받기위함
	private Integer weight;
	private Integer height;
	private Integer metabolism;
	private String gender;
	
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}
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
	
}
