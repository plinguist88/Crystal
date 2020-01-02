package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MeasureDTO implements Serializable {
	Integer standardHeight;
	String gender;
	Integer standarDweight;
	
	public Integer getStandardHeight() {
		return standardHeight;
	}
	public void setStandardHeight(Integer standardHeight) {
		this.standardHeight = standardHeight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getStandarDweight() {
		return standarDweight;
	}
	public void setStandarDweight(Integer standarDweight) {
		this.standarDweight = standarDweight;
	}
	
}
