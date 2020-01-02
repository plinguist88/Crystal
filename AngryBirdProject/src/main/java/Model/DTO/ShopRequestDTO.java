package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ShopRequestDTO implements Serializable {
	
	private String shopRequestResvNum;
	private String shopRequestResvName;
	private String managerCelebrity;
	private String shopsName;
	private Integer shopRequestStartTime;
	private Integer shopRequestEndTime;
	private String shopsDesignerName;
	private String employeeNum;
	
	public String getShopRequestResvNum() {
		return shopRequestResvNum;
	}
	public void setShopRequestResvNum(String shopRequestResvNum) {
		this.shopRequestResvNum = shopRequestResvNum;
	}
	public String getShopRequestResvName() {
		return shopRequestResvName;
	}
	public void setShopRequestResvName(String shopRequestResvName) {
		this.shopRequestResvName = shopRequestResvName;
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
	public String getShopsDesignerName() {
		return shopsDesignerName;
	}
	public void setShopsDesignerName(String shopsDesignerName) {
		this.shopsDesignerName = shopsDesignerName;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}