package remoteControl.Device;

import remoteControl.Device.Device;

public class SurroundSoundSystem implements Device {

    @Override
    public void turnOn() {
        System.out.println("turning on");
        incVol();

    }
    @Override
    public void turnOff() {
        System.out.println("turning off");
        decVol();
    }

    private void incVol(){
        System.out.println("inc vol to default");
    }

    private void decVol(){
        System.out.println("dec to default before turning off");
    }
}
