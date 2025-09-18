package creationalDesignPatterns.abstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        VehicleFactory curr = new FactoryProvider().getVehicleFactory(VehicleFactoryType.car);
        Vehicle myVehicle = curr.prepare("mega");
        myVehicle.book(23);

        myVehicle = curr.prepare("micro");
        myVehicle.book(40);

        curr = new FactoryProvider().getVehicleFactory(VehicleFactoryType.auto);
        myVehicle = curr.prepare("personal");
        myVehicle.book(40);

        curr = new FactoryProvider().getVehicleFactory(VehicleFactoryType.bike);
        myVehicle = curr.prepare("sports");
        myVehicle.book(40);
    }
}
