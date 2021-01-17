package creationalDesignPattern.FactoryVehicle;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("Car");
        car.startEngine();

    }
}
