package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarRequestDTO implements Serializable {
	private String carRequestRentalNum;
	private String carRequestRentalDate;
	private String carRequestReturnDate;
	private String carRequestType;
	private Integer carRequestPassengerNum;
	private String carRegNum;
	private String employeeNum;
	private String carRequestRealDate;
	
	public CarRequestDTO(String carRequestRentalNum, String carRequestRentalDate, String carRequestReturnDate,
			String carRequestType, Integer carRequestPassengerNum, String carRegNum, String employeeNum, String carRequestRealDate) {
		super();
		this.carRequestRentalNum = carRequestRentalNum;
		this.carRequestRentalDate = carRequestRentalDate;
		this.carRequestReturnDate = carRequestReturnDate;
		this.carRequestType = carRequestType;
		this.carRequestPassengerNum = carRequestPassengerNum;
		this.carRegNum = carRegNum;
		this.employeeNum = employeeNum;
		this.carRequestRealDate = carRequestRealDate;
	}

	public String getCarRequestRentalNum() {
		return carRequestRentalNum;
	}

	public void setCarRequestRentalNum(String carRequestRentalNum) {
		this.carRequestRentalNum = carRequestRentalNum;
	}

	public String getCarRequestRentalDate() {
		return carRequestRentalDate;
	}

	public void setCarRequestRentalDate(String carRequestRentalDate) {
		this.carRequestRentalDate = carRequestRentalDate;
	}

	public String getCarRequestReturnDate() {
		return carRequestReturnDate;
	}

	public void setCarRequestReturnDate(String carRequestReturnDate) {
		this.carRequestReturnDate = carRequestReturnDate;
	}

	public String getCarRequestType() {
		return carRequestType;
	}

	public void setCarRequestType(String carRequestType) {
		this.carRequestType = carRequestType;
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

	public String getCarRequestRealDate() {
		return carRequestRealDate;
	}

	public void setCarRequestRealDate(String carRequestRealDate) {
		this.carRequestRealDate = carRequestRealDate;
	}
}
