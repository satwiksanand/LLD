package creationalDesignPatterns.abstractFactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class BikeFactory implements VehicleFactory{
    private final VehicleFactoryType vehicleFactoryType = VehicleFactoryType.bike;
    private final Map<BikeType, Vehicle> allBikes;
    private final BikeType defaultBikeType = BikeType.normal;

    public BikeFactory(){
        allBikes = new HashMap<>();
        allBikes.put(BikeType.normal, new NormalBike());
        allBikes.put(BikeType.sports, new SportsBike());
    }

    @Override
    public VehicleFactoryType getVehicleFactoryType() {
        return this.vehicleFactoryType;
    }

    @Override
    public Vehicle prepare(String type) {
        for(BikeType bikeType : BikeType.values()){
            if(bikeType.toString().equalsIgnoreCase(type)){
                return allBikes.get(bikeType);
            }
        }
        return allBikes.get(defaultBikeType);
    }
}
