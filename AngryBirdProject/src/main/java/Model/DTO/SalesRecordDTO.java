package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SalesRecordDTO implements Serializable{

	private String itemsNo;
	private String itemsName;
	private Integer itemsTransaction;
	private Integer itemsTotalPrice;
	
	public SalesRecordDTO() {
		
	}
	
	public SalesRecordDTO(String itemsNo, String itemsName, Integer itemsTransaction, Integer itemsTotalPrice) {
		super();
		this.itemsNo = itemsNo;
		this.itemsName = itemsName;
		this.itemsTransaction = itemsTransaction;
		this.itemsTotalPrice = itemsTotalPrice;
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
	public Integer getItemsTransaction() {
		return itemsTransaction;
	}
	public void setItemsTransaction(Integer itemsTransaction) {
		this.itemsTransaction = itemsTransaction;
	}
	public Integer getItemsTotalPrice() {
		return itemsTotalPrice;
	}
	public void setItemsTotalPrice(Integer itemsTotalPrice) {
		this.itemsTotalPrice = itemsTotalPrice;
	}
	
	
}
