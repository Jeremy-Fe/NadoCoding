package Chap_07.camera;

public final class ActionCam extends Camera {
	public final String lens; // "광각렌즈"; 바로 초기화 해도 되지만
	public ActionCam() {
		super("액션 카메라");
		lens = "광각렌즈"; //  생성자는 시작과 동시에 시작 되기때문에 생성자에서 초기화해도 된다
	}

	public final void makeVideo() { // 오버라이드도 금지할 수 있음
		System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
	}
}
