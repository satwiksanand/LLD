package creationalDesignPatterns.abstractFactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class AutoFactory implements VehicleFactory{
    private final VehicleFactoryType vehicleFactoryType = VehicleFactoryType.auto;
    private final Map<AutoType, Vehicle> allAuto;
    private final AutoType defaultAutoType = AutoType.shared;

    public AutoFactory(){
        allAuto = new HashMap<>();
        allAuto.put(AutoType.personal, new PersonalAuto());
        allAuto.put(AutoType.shared, new SharedAuto());
    }

    @Override
    public VehicleFactoryType getVehicleFactoryType() {
        return this.vehicleFactoryType;
    }

    @Override
    public Vehicle prepare(String type) {
        for(AutoType autoType : AutoType.values()){
            if(autoType.toString().equalsIgnoreCase(type)){
                return allAuto.get(autoType);
            }
        }
        return allAuto.get(defaultAutoType);
    }
}
