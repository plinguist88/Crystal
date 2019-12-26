package Command;

public class CarRequestCommand {
	private String employeeNum;	
	private String carRequestRentalDate;
	private String carRequestReturnDate;
	private String carRequestType;

	
	public String getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(String employeeNum) {
		this.employeeNum = employeeNum;
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
}