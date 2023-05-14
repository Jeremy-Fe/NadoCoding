package Chap_07;

import Chap_07.camera.Camera;
import Chap_07.camera.FactoryCam;
import Chap_07.camera.SpeedCam;

public class _14_Polymorphism {
	public static void main(String[] args) {
		// 다형성
		
		// class person : 사람
		// class Student extends Person : 학생 ( 학생은 사람이다. Student is a person )
		// class Teacher extends Person : 선생님 ( 선생님은 사람이다. Teacher is a person )
		
		// 상속 받는 부모의 이름으로 정의가 가능 ( 다형성 ) 
		Camera camera = new Camera();
		Camera factoryCam = new FactoryCam();
		Camera speedCam = new SpeedCam();
		
		camera.showMainFearture();
		factoryCam.showMainFearture();
		speedCam.showMainFearture();
		
		
		System.out.println("----------------------------------");
		
		Camera[] cameras = new Camera[3];
		cameras[0] = new Camera();
		cameras[1] = new FactoryCam();
		cameras[2] = new SpeedCam();
		
		for (Camera cam : cameras) {
			cam.showMainFearture();
		}
		
		System.out.println("----------------------------------");
		
//		factoryCam.detectFire();
//		speedCam.checkSpeed();
		
		if (camera instanceof Camera) {
			System.out.println("카메라입니다.");
		}
		
		if (factoryCam instanceof FactoryCam) {
			((FactoryCam)factoryCam).detectFire();
		}
		
		if (speedCam instanceof SpeedCam) {
			((SpeedCam) speedCam).recognizeLicensePlate();
			((SpeedCam) speedCam).checkSpeed();
		}
		
//		Object[] objs = new Object[3];
//		objs[0] = new Camera();
//		objs[1] = new FactoryCam();
//		objs[2] = new SpeedCam();
	}
}
