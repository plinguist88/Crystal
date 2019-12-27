package Model.DTO;

public class SalesDTO {

	private String itemsNo;
	private String itemsName;
	private String itemsCount;
	private String itemsPrice;
	
	public SalesDTO () {
		
	}
	
	public SalesDTO(String itemsNo, String itemsName, String itemsCount, String itemsPrice) {
		super();
		this.itemsNo = itemsNo;
		this.itemsName = itemsName;
		this.itemsCount = itemsCount;
		this.itemsPrice = itemsPrice;
	}
	public String getItemsNo() {
		return itemsNo;
	}
	public void setItemsNo(String itemsNo) {
		this.itemsNo = itemsNo;
	}
	public String getItemsName() {
		return itemsName;
	}
	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}
	public String getItemsCount() {
		return itemsCount;
	}
	public void setItemsCount(String itemsCount) {
		this.itemsCount = itemsCount;
	}
	public String getItemsPrice() {
		return itemsPrice;
	}
	public void setItemsPrice(String itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	
	
}
