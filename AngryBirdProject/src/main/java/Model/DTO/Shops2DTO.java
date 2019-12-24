package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Shops2DTO implements Serializable{
	private String shopsNum;
	private String shopsName;
	private String shopsCoRegNum;
	private String shopsLoc;
	private String shopsAddr;
	private Long shopsOpenTime;
	private Long shopsCloseTime;
	
	public Shops2DTO(String shopsNum, String shopsName, String shopsCoRegNum, String shopsLoc, String shopsAddr,
			Long shopsOpenTime, Long shopsCloseTime) {
		super();
		this.shopsNum = shopsNum;
		this.shopsName = shopsName;
		this.shopsCoRegNum = shopsCoRegNum;
		this.shopsLoc = shopsLoc;
		this.shopsAddr = shopsAddr;
		this.shopsOpenTime = shopsOpenTime;
		this.shopsCloseTime = shopsCloseTime;
	}

	public String getShopsNum() {
		return shopsNum;
	}

	public void setShopsNum(String shopsNum) {
		this.shopsNum = shopsNum;
	}

	public String getShopsName() {
		return shopsName;
	}

	public void setShopsName(String shopsName) {
		this.shopsName = shopsName;
	}

	public String getShopsCoRegNum() {
		return shopsCoRegNum;
	}

	public void setShopsCoRegNum(String shopsCoRegNum) {
		this.shopsCoRegNum = shopsCoRegNum;
	}

	public String getShopsLoc() {
		return shopsLoc;
	}

	public void setShopsLoc(String shopsLoc) {
		this.shopsLoc = shopsLoc;
	}

	public String getShopsAddr() {
		return shopsAddr;
	}

	public void setShopsAddr(String shopsAddr) {
		this.shopsAddr = shopsAddr;
	}

	public Long getShopsOpenTime() {
		return shopsOpenTime;
	}

	public void setShopsOpenTime(Long shopsOpenTime) {
		this.shopsOpenTime = shopsOpenTime;
	}

	public Long getShopsCloseTime() {
		return shopsCloseTime;
	}

	public void setShopsCloseTime(Long shopsCloseTime) {
		this.shopsCloseTime = shopsCloseTime;
	}
}
