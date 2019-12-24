package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GradesContractorsDTO implements Serializable{
	private String contractorActGrede;
	private Long category1;
	private Long category2;
	
	public GradesContractorsDTO(String contractorActGrede, Long category1, Long category2) {
		super();
		this.contractorActGrede = contractorActGrede;
		this.category1 = category1;
		this.category2 = category2;
	}
	
	public String getContractorActGrede() {
		return contractorActGrede;
	}
	public void setContractorActGrede(String contractorActGrede) {
		this.contractorActGrede = contractorActGrede;
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
