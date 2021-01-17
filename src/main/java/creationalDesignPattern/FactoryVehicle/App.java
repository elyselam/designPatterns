package creationalDesignPattern.FactoryVehicle;

public class App {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
//        Vehicle car = vehicleFactory.getVehicle("CAR");
//        car.startEngine();

        Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR); //using ENUM
        car.startEngine();

    }
}
