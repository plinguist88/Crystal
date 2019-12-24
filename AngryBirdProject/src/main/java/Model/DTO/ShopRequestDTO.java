package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ShopRequestDTO implements Serializable {
	private String shopRequestRegNum;
	private String shopRequestRegDate;
	private String shopRequestResName;
	private Long shopRequestStartTime;
	private Long shopRequestEndTime;
	private String shopsNum;
	private String designerName;
	private String employeeNum;
	
	public ShopRequestDTO(String shopRequestRegNum, String shopRequestRegDate, String shopRequestResName,
			Long shopRequestStartTime, Long shopRequestEndTime, String shopsNum, String designerName,
			String employeeNum) {
		super();
		this.shopRequestRegNum = shopRequestRegNum;
		this.shopRequestRegDate = shopRequestRegDate;
		this.shopRequestResName = shopRequestResName;
		this.shopRequestStartTime = shopRequestStartTime;
		this.shopRequestEndTime = shopRequestEndTime;
		this.shopsNum = shopsNum;
		this.designerName = designerName;
		this.employeeNum = employeeNum;
	}

	public String getShopRequestRegNum() {
		return shopRequestRegNum;
	}

	public void setShopRequestRegNum(String shopRequestRegNum) {
		this.shopRequestRegNum = shopRequestRegNum;
	}

	public String getShopRequestRegDate() {
		return shopRequestRegDate;
	}

	public void setShopRequestRegDate(String shopRequestRegDate) {
		this.shopRequestRegDate = shopRequestRegDate;
	}

	public String getShopRequestResName() {
		return shopRequestResName;
	}

	public void setShopRequestResName(String shopRequestResName) {
		this.shopRequestResName = shopRequestResName;
	}

	public Long getShopRequestStartTime() {
		return shopRequestStartTime;
	}

	public void setShopRequestStartTime(Long shopRequestStartTime) {
		this.shopRequestStartTime = shopRequestStartTime;
	}

	public Long getShopRequestEndTime() {
		return shopRequestEndTime;
	}

	public void setShopRequestEndTime(Long shopRequestEndTime) {
		this.shopRequestEndTime = shopRequestEndTime;
	}

	public String getShopsNum() {
		return shopsNum;
	}

	public void setShopsNum(String shopsNum) {
		this.shopsNum = shopsNum;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}
}
