package creationalDesignPatterns.abstractFactoryDesignPattern;

public class SportsBike extends Bike{

    @Override
    public void setBaseCost() {
        this.baseCost = 1000;
    }

    @Override
    public void setVehicleType() {
        this.bikeType = BikeType.sports;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 120;
    }
}
