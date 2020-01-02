package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractorMeasureDTO implements Serializable {
	private String contractorId;
	private String measureDate;
	private Integer measureWeight;
	private Integer measureMeta;
	private Integer measureHeight;
	private String gender;
	
	
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
	public Integer getMeasureWeight() {
		return measureWeight;
	}
	public void setMeasureWeight(Integer measureWeight) {
		this.measureWeight = measureWeight;
	}
	public Integer getMeasureMeta() {
		return measureMeta;
	}
	public void setMeasureMeta(Integer measureMeta) {
		this.measureMeta = measureMeta;
	}
	public Integer getMeasureHeight() {
		return measureHeight;
	}
	public void setMeasureHeight(Integer measureHeight) {
		this.measureHeight = measureHeight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
