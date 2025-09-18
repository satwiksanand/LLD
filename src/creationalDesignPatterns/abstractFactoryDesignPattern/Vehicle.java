package creationalDesignPatterns.abstractFactoryDesignPattern;

public interface Vehicle {
    void book(int distance);
    void setBaseCost();
    void setVehicleType();
    void setVehicleChargesPerUnitDistance();
    int calculateCostOfBooking();
}
