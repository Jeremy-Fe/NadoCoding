package Chap_06;

public class _Quiz_06 {
	public static String getHiddenData(String data, int length) {
		String notHide = data.substring(0, length);
		for (int i = length; i < data.length(); i++) {
			notHide += "*";
		}
		
		return notHide;
	}
	public static void main(String[] args) {
		String name = "신우철"; // 이름
		String id = "001130-3000000"; // 주민번호
		String phone = "010-0000-0000"; // 전화번호
		
		System.out.println("이름 : " + getHiddenData(name, 1));
		System.out.println("주민번호 : " + getHiddenData(id, 8));
		System.out.println("전화번호 : " + getHiddenData(phone, 9));
	}
}
