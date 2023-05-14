package Chap_07;

import Chap_07.camera.Camera;

public class _16_Reference {
	public static void main(String[] args) {
		// 참조
		// 기본자료형 (Primitive Data Types) int, float, double, long, boolean, ... 메소드 없음, 소문자 시작
		
		int[] i = new int[3];
		System.out.println(i[0]); // 0
		
		
		double[] d = new double[3];
		System.out.println(d[0]); // 0.0
		
		// 참조 자료형 (Non-Primitive, Reference Data Types) : String, Camera, FactoryCam, SpeedCam.... 메소드가 있을 수 있음, 대문자 시작
		String[] s = new String[3];
		System.out.println(s[0]); // null
		
		Camera[] c = new Camera[3];
		System.out.println(c[0] == null); // true
		
		///////////////////////////////////////////////
		System.out.println("-----------------------");
		int a = 10;
		int b = 20;
		b = a;
		System.out.println(a);
		System.out.println(b);
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------");

		
		// 참조가 주의 해야할 점 (헷갈리 수 있어도 무조건 이해를 해야함)
		Camera c1 = new Camera();
		Camera c2 = new Camera();
		c1.name = "카메라1";
		c2.name = "카메라2";
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2 = c1;
		// c2 가 c1 의 풍선을 잡게 되어 값을 바꿀 시에 두 개의 풍선이 같이 바뀌게 됨
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2.name = "고장난 카메라";
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		System.out.println("-----------------------");
		changeName(c2);
		System.out.println(c1.name);
		System.out.println(c2.name);
		
	}
	
	public static void changeName(Camera camera) {
		camera.name = "잘못된 카메라";
	}
}









