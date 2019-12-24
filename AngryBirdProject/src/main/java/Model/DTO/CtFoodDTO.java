package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CtFoodDTO implements Serializable {
	String foodNo;
	String foodName;
	String foodOrigin;
	Integer foodQty;
	String foodUnit;
	Integer foodPrice;
	Integer foodPeriod;
	Integer foodKcal;
	String ccNo;

	public CtFoodDTO() {
		super();
	}
	
	public CtFoodDTO(String foodNo, String foodName, String foodOrigin, Integer foodQty, String foodUnit,
			Integer foodPrice, Integer foodPeriod, Integer foodKcal, String ccNo) {
		super();
		this.foodNo = foodNo;
		this.foodName = foodName;
		this.foodOrigin = foodOrigin;
		this.foodQty = foodQty;
		this.foodUnit = foodUnit;
		this.foodPrice = foodPrice;
		this.foodPeriod = foodPeriod;
		this.foodKcal = foodKcal;
		this.ccNo = ccNo;
	}
	
	public String getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(String foodNo) {
		this.foodNo = foodNo;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodOrigin() {
		return foodOrigin;
	}
	public void setFoodOrigin(String foodOrigin) {
		this.foodOrigin = foodOrigin;
	}
	public Integer getFoodQty() {
		return foodQty;
	}
	public void setFoodQty(Integer foodQty) {
		this.foodQty = foodQty;
	}
	public String getFoodUnit() {
		return foodUnit;
	}
	public void setFoodUnit(String foodUnit) {
		this.foodUnit = foodUnit;
	}
	public Integer getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(Integer foodPrice) {
		this.foodPrice = foodPrice;
	}
	public Integer getFoodPeriod() {
		return foodPeriod;
	}
	public void setFoodPeriod(Integer foodPeriod) {
		this.foodPeriod = foodPeriod;
	}
	public Integer getFoodKcal() {
		return foodKcal;
	}
	public void setFoodKcal(Integer foodKcal) {
		this.foodKcal = foodKcal;
	}
	public String getCcNo() {
		return ccNo;
	}
	public void setCcNo(String ccNo) {
		this.ccNo = ccNo;
	}
}
