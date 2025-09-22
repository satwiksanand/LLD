package structuralDesignPattern.compositeDesignPattern.carGarageExample;

import java.util.ArrayList;
import java.util.List;

public class CompositeParkedCar implements ParkedCars{
    private final List<ParkedCars> allCars;

    public CompositeParkedCar(){
        this.allCars = new ArrayList<>();
    }

    public void addCar(ParkedCars parkedCar){
        this.allCars.add(parkedCar);
    }

    @Override
    public void checkLock() {
        for(ParkedCars parkedCar : allCars){
            parkedCar.checkLock();
        }
    }

    @Override
    public void checkHeadLights() {
        for(ParkedCars parkedCar : allCars){
            parkedCar.checkHeadLights();
        }
    }
}
