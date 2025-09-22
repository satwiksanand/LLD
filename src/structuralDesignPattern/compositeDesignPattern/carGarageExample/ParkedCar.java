package structuralDesignPattern.compositeDesignPattern.carGarageExample;

public class ParkedCar implements ParkedCars{
    String carName;

    public ParkedCar(String name){
        this.carName = name;
    }

    @Override
    public void checkLock() {
        System.out.println("checking the locks of the car");
    }

    @Override
    public void checkHeadLights() {
        System.out.println("checking the headlights!");
    }
}
