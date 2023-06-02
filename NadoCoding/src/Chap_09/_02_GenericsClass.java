package Chap_09;

import Chap_09.coffee.Coffee;
import Chap_09.coffee.CoffeeByName;
import Chap_09.coffee.CoffeeByNickname;
import Chap_09.coffee.CoffeeByNumber;

public class _02_GenericsClass {
	public static void main(String[] args) {
		// 제네릭 클래스
		CoffeeByNumber c1 = new CoffeeByNumber(33);
		c1.ready();
		
		CoffeeByNickname c2 = new CoffeeByNickname("유재석");
		c2.ready();
		
		System.out.println("---------------------------");
		
		CoffeeByName c3 = new CoffeeByName(34);
		c3.ready();
		
		CoffeeByName c4 = new CoffeeByName("박명수");
		c4.ready();
		
		System.out.println("---------------------------");
		
		int c3Name = (int)c3.name;
		System.out.println("주문 고객 번호 : " + c3Name);
		
		String c4Name = (String)c4.name;
		System.out.println("주문 고객 성함 : " + c4Name);
		
//		c4Name = (String)c3.name; (( Object 타입은 형변환이 다 되기 때문에 문제가 됨
		System.out.println("---------------------------");

		
		Coffee<Integer> c5 = new Coffee<>(35);
		c5.ready();
		int c5Name = c5.name;
		System.out.println("주문 고객 번호 : " + c5Name);
		
		Coffee<String> c6 = new Coffee<>("조세호");
		c6.ready();
		String c6Name = c6.name;
		System.out.println("주문 고객 성함 : " + c6Name);
		
		System.out.println("---------------------------");

	}
}
