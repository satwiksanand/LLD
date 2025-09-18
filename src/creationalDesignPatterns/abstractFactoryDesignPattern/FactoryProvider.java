package creationalDesignPatterns.abstractFactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class FactoryProvider {
    private final Map<VehicleFactoryType, VehicleFactory> allFactory;

    public FactoryProvider(){
        allFactory = new HashMap<>();
        allFactory.put(VehicleFactoryType.car, new CarFactory());
        allFactory.put(VehicleFactoryType.auto, new AutoFactory());
        allFactory.put(VehicleFactoryType.bike, new BikeFactory());
    }

    public VehicleFactory getVehicleFactory(VehicleFactoryType type){
        return allFactory.get(type);
    }
}
