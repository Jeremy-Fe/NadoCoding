package Chap_06;

public class _06_WhenToUse {
	public static int getPower(int num) {
		// 메소드 안에 메소드를 호출할 수 있음
		return getPower(num, 2);
	}
	
	public static int getPower(int num, int exp) {
		int result = 1;
		for (int i = 0; i < exp; i++) {
			result *= num;
		}
		return result;
	}

	public static void main(String[] args) {
		// 메소드가 필요한 이유

		// 2의 2승을 구하기
//		int result = 1;
//		for (int i = 0; i < 2; i++) {
//			result *= 2;
//		}
		System.out.println(getPower(2, 2));

		// 3의 3승을 구하기
//		result = 1;
//		for (int i = 0; i < 3; i++) {
//			result *= 3;
//		}
		System.out.println(getPower(3, 3));

		// 4의 2승을구하기
//		result = 1;
//		for (int i = 0; i < 2; i++) {
//			result *= 4;
//		}
		System.out.println(getPower(4, 2));

	}
}
