package creationalDesignPattern.FactoryVehicle;

public enum VehicleType {
    //predefined constants
    BUS{
        public Vehicle getVehicle(){
            return new Bus();
        }
    },
    CAR{
        public Vehicle getVehicle(){
            return new Car();
        }
    };

    abstract Vehicle getVehicle();
}
