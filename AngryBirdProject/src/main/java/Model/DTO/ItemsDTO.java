package Model.DTO;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ItemsDTO implements Serializable {
	
	private String itemsNo; 
	private String itemsName;
	private String itemsSort; 
	private Integer itemsCount;
	private Integer itemsPrice; 
	private Integer itemsUnitPrice; 
	private Integer itemsProtrait; 
	private Integer itemsMarjin; 
	private String contractorNum; 
	private String contractorType; 
	private String contractorName; 
	private String contractorId;
	
	public ItemsDTO () {
		
	}
	
	public ItemsDTO(String itemsNo, String itemsName, String itemsSort, Integer itemsCount, Integer itemsPrice, Integer itemsUnitPrice,
			Integer itemsProtrait, Integer itemsMarjin, String contractorNum, String contractorType,
			String contractorName, String contractorId) {
		super();
		this.itemsNo = itemsNo;
		this.itemsName = itemsName;
		this.itemsSort = itemsSort;
		this.itemsCount = itemsCount;
		this.itemsPrice = itemsPrice;
		this.itemsUnitPrice = itemsUnitPrice;
		this.itemsProtrait = itemsProtrait;
		this.itemsMarjin = itemsMarjin;
		this.contractorNum = contractorNum;
		this.contractorType = contractorType;
		this.contractorName = contractorName;
		this.contractorId = contractorId;
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
	public String getItemsSort() {
		return itemsSort;
	}
	public void setItemsSort(String itemsSort) {
		this.itemsSort = itemsSort;
	}
	public Integer getItemsCount() {
		return itemsCount;
	}
	
	public void setItemsCount(Integer itemsCount) {
		this.itemsCount = itemsCount;
	}
	public Integer getItemsPrice() {
		return itemsPrice;
	}
	public void setItemsPrice(Integer itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	public Integer getItemsUnitPrice() {
		return itemsUnitPrice;
	}
	public void setItemsUnitPrice(Integer itemsUnitPrice) {
		this.itemsUnitPrice = itemsUnitPrice;
	}
	public Integer getItemsProtrait() {
		return itemsProtrait;
	}
	public void setItemsProtrait(Integer itemsProtrait) {
		this.itemsProtrait = itemsProtrait;
	}
	public Integer getItemsMarjin() {
		return itemsMarjin;
	}
	public void setItemsMarjin(Integer itemsMarjin) {
		this.itemsMarjin = itemsMarjin;
	}
	public String getContractorNum() {
		return contractorNum;
	}
	public void setContractorNum(String contractorNum) {
		this.contractorNum = contractorNum;
	}
	public String getContractorType() {
		return contractorType;
	}
	public void setContractorType(String contractorType) {
		this.contractorType = contractorType;
	}
	public String getContractorName() {
		return contractorName;
	}
	public void setContractorName(String contractorName) {
		this.contractorName = contractorName;
	}
	public String getContractorId() {
		return contractorId;
	}
	public void setContractorId(String contractorId) {
		this.contractorId = contractorId;
	}
	
	
}
