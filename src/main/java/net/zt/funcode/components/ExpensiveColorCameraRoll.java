package net.zt.funcode.components;


public class ExpensiveColorCameraRoll implements CameraRoll {
    @Override
    public void processing() {
        System.out.println("-1  кадр ОЧЕНЬ дорогой пленки");
    }
}
