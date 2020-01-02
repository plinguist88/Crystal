package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarRequestDTO implements Serializable {
	private String carRequestRentalNum;
	private String from;
	private String to;
	private String carType;
	private Integer carRequestPassengerNum;
	private String carRegNum;
	private String employeeNum;
	
	public String getCarRequestRentalNum() {
		return carRequestRentalNum;
	}
	public void setCarRequestRentalNum(String carRequestRentalNum) {
		this.carRequestRentalNum = carRequestRentalNum;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Integer getCarRequestPassengerNum() {
		return carRequestPassengerNum;
	}
	public void setCarRequestPassengerNum(Integer carRequestPassengerNum) {
		this.carRequestPassengerNum = carRequestPassengerNum;
	}
	public String getCarRegNum() {
		return carRegNum;
	}
	public void setCarRegNum(String carRegNum) {
		this.carRegNum = carRegNum;
	}
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}


}