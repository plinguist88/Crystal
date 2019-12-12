package Model.DTO;

public class EmployeeInfo {	// 직원의 로그인 정보를 저장하는 곳

	private String id;
	private String email;
	private String name;
	private String pw;
	
	public EmployeeInfo() {
		
	}
	
	public EmployeeInfo(String id, String email, String name, String pw) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
