package creationalDesignPatterns.abstractFactoryDesignPattern;

public class NormalBike extends Bike{
    @Override
    public void setBaseCost() {
        this.baseCost = 400;
    }

    @Override
    public void setVehicleType() {
        this.bikeType = BikeType.normal;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 50;
    }
}
