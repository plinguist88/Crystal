package Command;

public class ShopRequestCommand {

	private String employeeNum;
	private String managerCelebrity;
	private String shopsName;
	private Integer shopRequestStartTime;
	private Integer shopRequestEndTime;
	
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getManagerCelebrity() {
		return managerCelebrity;
	}
	public void setManagerCelebrity(String managerCelebrity) {
		this.managerCelebrity = managerCelebrity;
	}
	public String getShopsName() {
		return shopsName;
	}
	public void setShopsName(String shopsName) {
		this.shopsName = shopsName;
	}
	public Integer getShopRequestStartTime() {
		return shopRequestStartTime;
	}
	public void setShopRequestStartTime(Integer shopRequestStartTime) {
		this.shopRequestStartTime = shopRequestStartTime;
	}
	public Integer getShopRequestEndTime() {
		return shopRequestEndTime;
	}
	public void setShopRequestEndTime(Integer shopRequestEndTime) {
		this.shopRequestEndTime = shopRequestEndTime;
	}
}