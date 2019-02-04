package net.zt.funcode.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("cheapCamera")
public class CheapCamera extends CameraImpl {

    @Autowired
    @Qualifier("cheap") /// здесь происходит связь с @Component("cheap") класс CheapColorCameraRoll
    @Override           /// хотя из вашей лекции я сделал вывод что они не пересекаются...
    public void setCameraRoll(CameraRoll cameraRoll) {
        super.setCameraRoll(cameraRoll);
    }

}
