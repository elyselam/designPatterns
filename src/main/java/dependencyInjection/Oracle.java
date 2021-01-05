package dependencyInjection;

public class Oracle implements Database {
    @Override
    public void connect(){
        System.out.println("connecting oracle");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnect oracle");
    }
}
