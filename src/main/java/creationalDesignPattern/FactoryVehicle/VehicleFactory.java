package creationalDesignPattern.FactoryVehicle;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("Bus")){
            return new Bus();
        }
        return null;
    }
}
