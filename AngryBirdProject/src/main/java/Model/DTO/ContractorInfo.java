package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContractorInfo implements Serializable{

	private String contractorId;
	private String contractorPw;
	private String contractorName;
	private Integer contractorLevel;
	
	
	
	public ContractorInfo(String contractorId, String contractorPw, String contractorName, Integer contractorLevel) {
		super();
		this.contractorId = contractorId;
		this.contractorPw = contractorPw;
		this.contractorName = contractorName;
		this.contractorLevel = contractorLevel;
	}
	
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	public String getContractorPw() {
		return contractorPw;
	}
	public void setContractorPw(String contractorPw) {
		this.contractorPw = contractorPw;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public Integer getContractorLevel() {
		return contractorLevel;
	}
	public void setContractorLevel(Integer contractorLevel) {
		this.contractorLevel = contractorLevel;
	}
	
	
}
