package creationalDesignPatterns.prototypeDesignPattern.vehicleExample;

public class Vehicle implements Cloneable{
    private int seats;
    private int tyres;
    private String color;
    private String fuelType;

    public Vehicle(int seats, int tyres, String color, String fuelType){
        this.color = color;
        this.fuelType = fuelType;
        this.seats = seats;
        this.tyres = tyres;
    }

    public int getSeats() {
        return seats;
    }

    public int getTyres() {
        return tyres;
    }

    public String getColor() {
        return color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public Vehicle clone() {
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString(){
        return "Vehicle{" +
                "seats=" + this.seats +
                ", tyres=" + this.tyres +
                ", color='" + this.color + '\'' +
                ", fuelType='" + this.fuelType + '\'' +
                '}';
    }
}
