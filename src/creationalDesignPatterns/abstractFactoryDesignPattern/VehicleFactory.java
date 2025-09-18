package creationalDesignPatterns.abstractFactoryDesignPattern;

public interface VehicleFactory {
    VehicleFactoryType getVehicleFactoryType();
    Vehicle prepare(String type);
}
