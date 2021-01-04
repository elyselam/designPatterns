package remoteControl;


import remoteControl.Device.Projector;

//Open Close Principle

public class User {
    public static void main(String[] args) {
        Projector projector = new Projector();

//        SingletonRemoteControl remoteControl = SingletonRemoteControl.getINSTANCE();
        SingletonRemoteControl.getINSTANCE().connectToDevice(projector);
    }
}
