package Encrypt;

import java.security.MessageDigest;

public class Encrypt {

	static MessageDigest md;
	static StringBuffer sb;
	
	public static String getEncryption(String userPw) {	// Pw를 인자값으로 받아올거임
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		md.update(userPw.getBytes() );// 스트링을 바이트로 바꿔야 암호화가 가능함
		byte[] byteData = md.digest();// 바이트는 숫자니 다시 스트링으로 바꿀꺼임
		sb = new StringBuffer();	
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString( (byteData[i]&0xff) + 0x100, 16).substring(1) );	// 한글자씩 어펜드 할거임
		}
		return sb.toString();
	}
}
