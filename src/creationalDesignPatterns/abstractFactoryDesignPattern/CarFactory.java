package creationalDesignPatterns.abstractFactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class CarFactory implements VehicleFactory{
    private final VehicleFactoryType vehicleFactoryType = VehicleFactoryType.car;
    private final Map<CarType, Vehicle> allCars;
    private final CarType defaultCarType = CarType.micro;

    public CarFactory(){
        allCars = new HashMap<>();
        allCars.put(CarType.mini, new MiniCar());
        allCars.put(CarType.mega, new MegaCar());
        allCars.put(CarType.micro, new MicroCar());
    }

    @Override
    public VehicleFactoryType getVehicleFactoryType() {
        return this.vehicleFactoryType;
    }

    @Override
    public Vehicle prepare(String type) {
        for(CarType carType : CarType.values()){
            if(carType.toString().equalsIgnoreCase(type)){
                return allCars.get(carType);
            }
        }
        return allCars.get(defaultCarType);
    }
}
