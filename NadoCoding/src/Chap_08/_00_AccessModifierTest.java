package Chap_08;

import Chap_07.*; // 챕터 07 의 모든 클래스를 빌리겠다

public class _00_AccessModifierTest {
	public static void main(String[] args) {
		Refur b1 = new Refur();
		b1.modelName = "까망이"; // public
//		b1.resolution = "FHD"; // default (같은 패키지 내에서만)
//		b1.price = 200000; // private
//		b1.color = "블랙"; // protectd (같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능)
		
		BlackBox b2;
		
	}
}
