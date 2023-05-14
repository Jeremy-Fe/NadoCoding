package Chap_07.camera;

public class SlowActionCam {
	public String name;
	public SlowActionCam() {
		this.name = "슬로우 액션 카메라";
	}
	
//	public void makeVideo() { 오버라이드의 주체가 final 이라 사용을 못함
//		System.out.println(this.name + " : " + this.lens 
//				+ "로 촬영한 영상을 통해 멋진 슬로우모드 비디오를 제작합니다.");
//	}
	
	public void makeVideo() {
		System.out.println("자체 개발한 비디오 제작 가능");
	}
}
