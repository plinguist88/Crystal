package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarRequestDTO implements Serializable {
	private String carRequestRentalNum;
	private String carRequestRentalDate;
	private String carRequestReturnDate;
	private String carRequestType;
	private Long carRequestPassengerNum;
	private String carRegNum;
	private String employeeNum;
	
	public CarRequestDTO(String carRequestRentalNum, String carRequestRentalDate, String carRequestReturnDate,
			String carRequestType, Long carRequestPassengerNum, String carRegNum, String employeeNum) {
		super();
		this.carRequestRentalNum = carRequestRentalNum;
		this.carRequestRentalDate = carRequestRentalDate;
		this.carRequestReturnDate = carRequestReturnDate;
		this.carRequestType = carRequestType;
		this.carRequestPassengerNum = carRequestPassengerNum;
		this.carRegNum = carRegNum;
		this.employeeNum = employeeNum;
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

	public Long getCarRequestPassengerNum() {
		return carRequestPassengerNum;
	}

	public void setCarRequestPassengerNum(Long carRequestPassengerNum) {
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
