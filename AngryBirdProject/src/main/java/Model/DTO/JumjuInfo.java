package Model.DTO;

public class JumjuInfo {	// 점주의 로그인 정보를 저장하는 곳

	private String id;
	private String pw;
	private String name;
	private String storeOwnerPhone;
	private String storeCodeNum;
	
	public JumjuInfo () {
		
	}

	public JumjuInfo(String id, String pw, String name, String storeOwnerPhone, String storeCodeNum) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.storeOwnerPhone = storeOwnerPhone;
		this.storeCodeNum = storeCodeNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStoreOwnerPhone() {
		return storeOwnerPhone;
	}

	public void setStoreOwnerPhone(String storeOwnerPhone) {
		this.storeOwnerPhone = storeOwnerPhone;
	}

	public String getStoreCodeNum() {
		return storeCodeNum;
	}

	public void setStoreCodeNum(String storeCodeNum) {
		this.storeCodeNum = storeCodeNum;
	}
	
}
