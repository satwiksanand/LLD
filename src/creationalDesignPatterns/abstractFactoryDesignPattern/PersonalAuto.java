package creationalDesignPatterns.abstractFactoryDesignPattern;

public class PersonalAuto extends Auto{
    @Override
    public void setBaseCost() {
        this.baseCost = 45;
    }

    @Override
    public void setVehicleType() {
        this.autoType = AutoType.personal;
    }

    @Override
    public void setVehicleChargesPerUnitDistance() {
        this.vehicleChargePerUnitDistance = 15;
    }
}
