package Chap_07;

import Chap_07.camera.ActionCam;
import Chap_07.camera.SlowActionCam;

public class _17_Final {
	public static void main(String[] args) {
		// Final 
		
		// public (final) class ...
		// public (final) void ...
		// public > abstract > static > final ....
		
		
		ActionCam actionCam = new ActionCam();
//		actionCam.lens = "표준렌즈"; final 을 고정해두었기 때문에 값 변경 불가
		actionCam.recordVideo();
		actionCam.makeVideo();
		
		System.out.println("-------------------------------");
		
		SlowActionCam slowActionCam = new SlowActionCam();
//		slowActionCam.recordVideo();
		slowActionCam.makeVideo();
	}
}
