package creationalDesignPattern.FactoryVehicle;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("start car engine");
    }
}
