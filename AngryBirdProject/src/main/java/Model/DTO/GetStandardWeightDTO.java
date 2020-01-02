package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetStandardWeightDTO implements Serializable{
	Integer height;
	Integer weight; 
	Integer age;
	String gender;
	Integer standardWeight;
	
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getStandardWeight() {
		return standardWeight;
	}
	public void setStandardWeight(Integer standardWeight) {
		this.standardWeight = standardWeight;
	}
	
}
