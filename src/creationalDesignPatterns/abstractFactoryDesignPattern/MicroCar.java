package creationalDesignPatterns.abstractFactoryDesignPattern;

public class MicroCar extends Car{

    @Override
    public void setBaseCost() {
        this.baseCost = 50;
    }

    @Override
    public void setVehicleType() {
        this.carType = CarType.micro;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 20;
    }
}
