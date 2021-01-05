package dependencyInjection;

public class MySql implements Database {
    @Override
    public void connect(){
        System.out.println("connecting mysql");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnect mysql");
    }
}
