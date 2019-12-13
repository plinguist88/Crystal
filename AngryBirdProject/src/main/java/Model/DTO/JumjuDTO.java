package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class JumjuDTO implements Serializable{

	private String storeOwnerId;
	private String storeOwnerPw;
	private String storeOwnerName;
	private String storeNo;
	private String storeOwnerBank;
	private String storeOwnerAccount;
	private String storeOwnerPhone;
	private String storeOwnerAddr;
	private Integer storeOwnerCalculMoney;
	private String storeCodeNum;
	private String storeContractDay;
	
	public JumjuDTO() {
		
	}
	public JumjuDTO(String storeOwnerId, String storeOwnerPw, String storeOwnerName, String storeNo,
			String storeOwnerBank, String storeOwnerAccount, String storeOwnerPhone, String storeOwnerAddr,
			Integer storeOwnerCalculMoney, String storeCodeNum, String storeContractDay) {
		super();
		this.storeOwnerId = storeOwnerId;
		this.storeOwnerPw = storeOwnerPw;
		this.storeOwnerName = storeOwnerName;
		this.storeNo = storeNo;
		this.storeOwnerBank = storeOwnerBank;
		this.storeOwnerAccount = storeOwnerAccount;
		this.storeOwnerPhone = storeOwnerPhone;
		this.storeOwnerAddr = storeOwnerAddr;
		this.storeOwnerCalculMoney = storeOwnerCalculMoney;
		this.storeCodeNum = storeCodeNum;
		this.storeContractDay = storeContractDay;
	}

	public String getStoreOwnerId() {
		return storeOwnerId;
	}

	public void setStoreOwnerId(String storeOwnerId) {
		this.storeOwnerId = storeOwnerId;
	}

	public String getStoreOwnerPw() {
		return storeOwnerPw;
	}

	public void setStoreOwnerPw(String storeOwnerPw) {
		this.storeOwnerPw = storeOwnerPw;
	}

	public String getStoreOwnerName() {
		return storeOwnerName;
	}

	public void setStoreOwnerName(String storeOwnerName) {
		this.storeOwnerName = storeOwnerName;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getStoreOwnerBank() {
		return storeOwnerBank;
	}

	public void setStoreOwnerBank(String storeOwnerBank) {
		this.storeOwnerBank = storeOwnerBank;
	}

	public String getStoreOwnerAccount() {
		return storeOwnerAccount;
	}

	public void setStoreOwnerAccount(String storeOwnerAccount) {
		this.storeOwnerAccount = storeOwnerAccount;
	}

	public String getStoreOwnerPhone() {
		return storeOwnerPhone;
	}

	public void setStoreOwnerPhone(String storeOwnerPhone) {
		this.storeOwnerPhone = storeOwnerPhone;
	}

	public String getStoreOwnerAddr() {
		return storeOwnerAddr;
	}

	public void setStoreOwnerAddr(String storeOwnerAddr) {
		this.storeOwnerAddr = storeOwnerAddr;
	}

	public Integer getStoreOwnerCalculMoney() {
		return storeOwnerCalculMoney;
	}

	public void setStoreOwnerCalculMoney(Integer storeOwnerCalculMoney) {
		this.storeOwnerCalculMoney = storeOwnerCalculMoney;
	}

	public String getStoreCodeNum() {
		return storeCodeNum;
	}

	public void setStoreCodeNum(String storeCodeNum) {
		this.storeCodeNum = storeCodeNum;
	}
	public String getStoreContractDay() {
		return storeContractDay;
	}
	public void setStoreContractDay(String storeContractDay) {
		this.storeContractDay = storeContractDay;
	}
	
	
	
}
