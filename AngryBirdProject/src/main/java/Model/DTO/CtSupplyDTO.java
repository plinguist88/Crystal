package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CtSupplyDTO implements Serializable{
	String scNo;
	Long scLicense;
	String scName1;
	String scName2;
	String scSort;
	String scAddr;
	String scPh;

	public CtSupplyDTO() {
		super();
	}
	
	public CtSupplyDTO(String scNo, Long scLicense, String scName1, String scName2, String scSort,
			String scAddr, String scPh) {
		super();
		this.scNo = scNo;
		this.scLicense = scLicense;
		this.scName1 = scName1;
		this.scName2 = scName2;
		this.scSort = scSort;
		this.scAddr = scAddr;
		this.scPh = scPh;
	}
	
	public String getScNo() {
		return scNo;
	}
	public void setScNo(String scNo) {
		this.scNo = scNo;
	}
	public Long getScLicense() {
		return scLicense;
	}
	public void setScLicense(Long scLicense) {
		this.scLicense = scLicense;
	}
	public String getScName1() {
		return scName1;
	}
	public void setScName1(String scName1) {
		this.scName1 = scName1;
	}
	public String getScName2() {
		return scName2;
	}
	public void setScName2(String scName2) {
		this.scName2 = scName2;
	}
	public String getScSort() {
		return scSort;
	}
	public void setScSort(String scSort) {
		this.scSort = scSort;
	}
	public String getScAddr() {
		return scAddr;
	}
	public void setScAddr(String scAddr) {
		this.scAddr = scAddr;
	}
	public String getScPh() {
		return scPh;
	}
	public void setScPh(String scPh) {
		this.scPh = scPh;
	}
	
	
}
