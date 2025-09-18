package creationalDesignPatterns.abstractFactoryDesignPattern;

public class SharedAuto extends Auto{
    @Override
    public void setBaseCost() {
        this.baseCost = 30;
    }

    @Override
    public void setVehicleType() {
        this.autoType = AutoType.shared;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 5;
    }
}
