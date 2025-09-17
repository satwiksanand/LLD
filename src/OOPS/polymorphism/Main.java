package OOPS.polymorphism;

/*
* there are basically two different types of polymorphism
* compile time and run time polymorphism
* Compile time polymorphism also known as method overloading and run time also known method overriding
* think of method overloading as multiple with same name
* think of them as same name but with different definition.
* */

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = new Car();
        vehicle.printMessage();
        vehicle = new Bike();
        vehicle.printMessage();
    }
}
