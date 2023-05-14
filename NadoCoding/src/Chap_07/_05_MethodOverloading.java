package Chap_07;

public class _05_MethodOverloading {
	public static void main(String[] args) {
		BlackBox b1 = new BlackBox();
		b1.modelName = "까망이";
		
		b1.record(false, false, 10);
		
		System.out.println("---------------------------------");
		
		b1.record(true, false, 3);
		
		System.out.println("---------------------------------");
		
		b1.record();
		
		// String 의 Method Overloadinf 살펴보기 우리도 더 나은 코드를 작성할 수 있다.
		String s = "BlackBox";
		System.out.println(s.indexOf("a"));
		
	}
}
