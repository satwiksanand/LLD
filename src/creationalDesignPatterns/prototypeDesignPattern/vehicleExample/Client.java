package creationalDesignPatterns.prototypeDesignPattern.vehicleExample;

public class Client {
    public static void main(String[] args) {
        VehicleFactory car = new VehicleFactory();
        System.out.println(car.toString());
        Vehicle myCar = car.vehicleWithNewColor("Purple");
        System.out.println(myCar.toString());

        VehicleFactory bike = new VehicleFactory(new Vehicle(1, 2, "red", "diesel"));
        Vehicle myBike = bike.vehicleWithNewColor("Black");
        System.out.println(myBike.toString());

        //you can also merge the builder design pattern and prototype design pattern making use of both of them
        //the builder design pattern can help you with custom design updates and the prototype design pattern can help
        //you in making object creation efficient.
    }
}
