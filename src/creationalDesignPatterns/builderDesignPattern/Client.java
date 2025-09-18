package creationalDesignPatterns.builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Car car = Car.builder().carName("toyota").engine("V8").distanceTravelled(78).build();
        System.out.println(car.toString());
    }
}
