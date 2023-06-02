package Chap_09.coffee;

public class CoffeeByNumber {
	// 필드
	public int waitingNumber;
	
	
	// 생성자
	public CoffeeByNumber(int waitingNumber) {
		this.waitingNumber = waitingNumber;
	}

	public void ready() {
		System.out.println("커피 준비 완료 : " + waitingNumber);
	}
	
	
}
