package net.zt.funcode.components;

import net.zt.funcode.annotation.ExpensiveCameraRoll;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.zt.funcode.annotation.UnproducableCameraRoll;

@Component("cameraRoll")
@UnproducableCameraRoll(usingCameraRollClass=BlackAndWhiteCameraRoll.class)
public class ColorCameraRoll implements CameraRoll {

	public void processing() {
		// TODO Auto-generated method stub
		System.out.println("-1 цветной кадр");
		
	}

	
	
	
	

	
	
	
	
	
	

}
