package creationalDesignPatterns.abstractFactoryDesignPattern;

public abstract class Bike implements Vehicle{
    protected BikeType bikeType = BikeType.normal;
    int baseCost = 0;
    int vehicleChargePerUnitDistance = 0;
    int distance = 0;

    @Override
    public void book(int distance){
        this.distance = distance;
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking();
        System.out.println("the cost of booking " + this.bikeType + " is:-> " + cost + ".");
    }

    @Override
    public int calculateCostOfBooking(){
        int serviceCharge = 30;
        return this.baseCost + this.distance * this.vehicleChargePerUnitDistance + serviceCharge;
    }
}
