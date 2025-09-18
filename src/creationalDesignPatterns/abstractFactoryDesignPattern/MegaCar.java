package creationalDesignPatterns.abstractFactoryDesignPattern;

public class MegaCar extends Car{
    @Override
    public void setBaseCost() {
        this.baseCost = 250;
    }

    @Override
    public void setVehicleType() {
        this.carType = CarType.mega;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 50;
    }
}
