package Command;

public class JumjuJoinCommand {

	private String storeOwnerId;
	private String storeOwnerName;
	private String storeOwnerPw;
	private String jjPwCon;
	private String storeNo;
	private String storeOwnerBank;
	private String storeOwnerAccount;
	private String storeOwnerPhone;
	private String storeOwnerAddr;
	private String storeOwnerAddr1;
	private String storeOwnerAddr2;
	private String storeOwnerAddr3;
	private Integer storeOwnerCalculMoney;
	private String storeCodeNum;
	private String storeContractDay;
	
	public String getStoreOwnerId() {
		return storeOwnerId;
	}


	public void setStoreOwnerId(String storeOwnerId) {
		this.storeOwnerId = storeOwnerId;
	}


	public String getStoreOwnerName() {
		return storeOwnerName;
	}


	public void setStoreOwnerName(String storeOwnerName) {
		this.storeOwnerName = storeOwnerName;
	}


	public String getStoreOwnerPw() {
		return storeOwnerPw;
	}


	public void setStoreOwnerPw(String storeOwnerPw) {
		this.storeOwnerPw = storeOwnerPw;
	}


	public String getJjPwCon() {
		return jjPwCon;
	}


	public void setJjPwCon(String jjPwCon) {
		this.jjPwCon = jjPwCon;
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
	

	public boolean pwEqualsPwcon() {
		
		if (jjPwCon.equals(storeOwnerPw) ) {
			return true;
		}
		return false;
	}


	public String getStoreContractDay() {
		return storeContractDay;
	}


	public void setStoreContractDay(String storeContractDay) {
		this.storeContractDay = storeContractDay;
	}


	public String getStoreOwnerAddr1() {
		return storeOwnerAddr1;
	}


	public void setStoreOwnerAddr1(String storeOwnerAddr1) {
		this.storeOwnerAddr1 = storeOwnerAddr1;
	}


	public String getStoreOwnerAddr2() {
		return storeOwnerAddr2;
	}


	public void setStoreOwnerAddr2(String storeOwnerAddr2) {
		this.storeOwnerAddr2 = storeOwnerAddr2;
	}


	public String getStoreOwnerAddr3() {
		return storeOwnerAddr3;
	}


	public void setStoreOwnerAddr3(String storeOwnerAddr3) {
		this.storeOwnerAddr3 = storeOwnerAddr3;
	}


}
