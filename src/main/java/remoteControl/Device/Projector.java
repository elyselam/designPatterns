package remoteControl.Device;



public class Projector implements Device{

    @Override
    public void turnOn() {
        System.out.println("turning on projector");
        pullDownScreen();
    }

    @Override
    public void turnOff() {
        System.out.println("turning off");
        pullUpScreen();

    }
    private void pullDownScreen(){
        System.out.println("pull down");
    }
    private void pullUpScreen(){
        System.out.println("pull up");
    }

}
