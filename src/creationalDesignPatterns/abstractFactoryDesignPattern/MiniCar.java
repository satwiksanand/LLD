package creationalDesignPatterns.abstractFactoryDesignPattern;

public class MiniCar extends Car{
    @Override
    public void setBaseCost() {
        this.baseCost = 100;
    }

    @Override
    public void setVehicleType() {
        this.carType = CarType.mini;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 35;
    }
}
