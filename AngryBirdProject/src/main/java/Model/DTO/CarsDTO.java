package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarsDTO implements Serializable{
	private String carRegNum;
	private String carType;
	private Integer carPassengerNum;
	
	public CarsDTO () {
		
	}
	public CarsDTO(String carRegNum, String carType, Integer carPassengerNum) {
		super();
		this.carRegNum = carRegNum;
		this.carType = carType;
		this.carPassengerNum = carPassengerNum;
	}
	public String getCarRegNum() {
		return carRegNum;
	}
	public void setCarRegNum(String carRegNum) {
		this.carRegNum = carRegNum;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Integer getCarPassengerNum() {
		return carPassengerNum;
	}
	public void setCarPassengerNum(Integer carPassengerNum) {
		this.carPassengerNum = carPassengerNum;
	}
}
