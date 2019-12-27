package Command;

public class CarRequestCommand {
	private String employeeNum;
	private String carRequestRentalDate;
	private String carRequestReturnDate;
	private String carType;
	private String carPassengerNum;

	public String getEmployeeNum() {
		return employeeNum;
	}

	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getCarRequestRentalDate() {
		return carRequestRentalDate;
	}

	public String getCarPassengerNum() {
		return carPassengerNum;
	}

	public void setCarPassengerNum(String carPassengerNum) {
		this.carPassengerNum = carPassengerNum;
	}

	public void setCarRequestRentalDate(String carRequestRentalDate) {
		this.carRequestRentalDate = carRequestRentalDate;
	}

	public String getCarRequestReturnDate() {
		return carRequestReturnDate;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setCarRequestReturnDate(String carRequestReturnDate) {
		this.carRequestReturnDate = carRequestReturnDate;
	}

}