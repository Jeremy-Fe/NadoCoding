package Chap_07.camera;


// FactoryCam is a Camera. (IS-A)
public class FactoryCam extends Camera { // 자식 클래스 (하나의 부모에게만 상속 받을 수 있음)
	public FactoryCam() {
		// this.name = "공장 카메라";
		super("공장 카메라");
	}
	
	public void recordVideo() {
		super.recordVideo();
		detectFire();
	}
	
	public void detectFire() {
		// 화재 감지
		System.out.println("화재를 감지합니다.");
	}
	
	public void showMainFearture() {
		System.out.println(this.name + "의 주요기능은 : 화재 감지");
	}
	
}
