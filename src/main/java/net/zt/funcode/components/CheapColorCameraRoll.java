package net.zt.funcode.components;

import net.zt.funcode.annotation.ExpensiveCameraRoll;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("cheap")
@ExpensiveCameraRoll(usingExpensiveCameraRoll = ExpensiveColorCameraRoll.class)
public class CheapColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1  кадр ОЧЕНЬ дешевой пленки");
    }
}
