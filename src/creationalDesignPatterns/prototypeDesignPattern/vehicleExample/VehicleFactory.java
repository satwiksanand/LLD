package creationalDesignPatterns.prototypeDesignPattern.vehicleExample;

public class VehicleFactory {
    private final Vehicle vehiclePrototype;

    public VehicleFactory(){
        vehiclePrototype = new Vehicle(4, 4, "Black", "Electric");
    }

    //you can also pass your own default prototype object using parameterized constructor
    //the constructor here is overloaded but again that is something that you have already studied.
    public VehicleFactory(Vehicle vehiclePrototype){
        this.vehiclePrototype = vehiclePrototype;
    }

    public Vehicle vehicleWithNewFuelType(String newFuelType){
        Vehicle clonedVehicle = vehiclePrototype.clone();
        clonedVehicle.setFuelType(newFuelType);
        return clonedVehicle;
    }

    public Vehicle vehicleWithNewColor(String newColor){
        Vehicle clonedVehicle = vehiclePrototype.clone();
        clonedVehicle.setColor(newColor);
        return clonedVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "seats=" + this.vehiclePrototype.getSeats() +
                ", tyres=" + this.vehiclePrototype.getTyres() +
                ", color='" + this.vehiclePrototype.getColor() + '\'' +
                ", fuelType='" + this.vehiclePrototype.getFuelType() + '\'' +
                '}';
    }
}
