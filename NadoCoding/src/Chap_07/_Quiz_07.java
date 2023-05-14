package Chap_07;

public class _Quiz_07 {
	public static void main(String[] args) {
		HamBurger[] hamBergers = new HamBurger[3];
		hamBergers[0] = new HamBurger();
		hamBergers[1] = new cheeseBurger();
		hamBergers[2] = new ShrimpBurger();
		
		System.out.println("주문하신 메뉴를 만듭니다.");
		System.out.println("-------------------");
		for (HamBurger hamBurger : hamBergers) {
			hamBurger.cook();
			System.out.println("--------------");
		}
		System.out.println("메뉴 준비가 완료되었습니다.");
	}
}

// 전체적으로 이해가 부족하고, 이름 선언 하기가 가장 헷갈렸음 
// 그리고 super 가 무엇인지 모른다 
// 그나마 overriding 은 그나마 사용할 줄 앎
// 계속 전에 만든 예제를 들여다봄 (그래야 문제를 해결 할 수 있음)

class HamBurger {
	public String name;
	
	public HamBurger() {
		this("햄버거");
	}
	public HamBurger(String name) {
		this.name = name;
	}
	public void cook() {
		System.out.println(this.name + "를 만듭니다.\n빵 사이에 들어가는 재료는 ?");
		System.out.println("> 양상추\n+ 패티\n+ 피클");
	}
}

class cheeseBurger extends HamBurger {
	public cheeseBurger() {
		super("치즈버거");
	}
	public void cook() {
		super.cook();
		System.out.println("+ 치즈");
	}
}

class ShrimpBurger extends HamBurger {
	public ShrimpBurger() {
		super("새우버거");
	}
	public void cook() {
		super.cook();
		System.out.println("+ 새우");
	}
}
