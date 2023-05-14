package Chap_06;

public class _05_Overloading {
	// 메소드 오버로딩  똑같은 getPower 를 정의 했는데 전달되는 값에 따라서 각각 호출하게 됨
	// 전달값의 타입이 다르거나 전달값의 갯수가 다를 때 같은 이름의 메소드를 사용할 수 있음
	public static int getPower(int num) {
		int result = num * num;
		return result;
		// return num * num;
	}
	
// 	public static double getPower(int num) {  이거는 안됨 반환값이 다르기 때문에 ) 
//	int result = num * num;
//	return result;
//	return num * num;
//}
	
	public static int getPower(String strnum) {
		int num = Integer.parseInt(strnum);
		return num * num;
	}
	
	public static int getPower(int num, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= num;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 메소드 오버로딩
		// 전달값의 타입이 다르거나 전달값의 갯수가 다를 때 같은 이름의 메소드를 사용할 수 있음
		
		System.out.println(getPower(3)); // 3 * 3 = 9
		
		System.out.println(getPower("4")); // 4 * 4 = 16
		
		System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
		
		
	}
}
