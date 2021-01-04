package remoteControl;

import remoteControl.Device.Device;

public class SingletonRemoteControl {
    private Device device = null;
    private static SingletonRemoteControl INSTANCE = new SingletonRemoteControl();

    public SingletonRemoteControl() {
    }

    public static SingletonRemoteControl getINSTANCE() {
        if (INSTANCE == null){
            INSTANCE = new SingletonRemoteControl();
        }
        return INSTANCE;
    }

    public void connectToDevice(Device aDevice) {
        this.device = aDevice;
        System.out.println("connecting to: "+device);
    }
    public void clickOff() {
        device.turnOff();
    }
    public void clickOn() {
        device.turnOn();
    }
}
