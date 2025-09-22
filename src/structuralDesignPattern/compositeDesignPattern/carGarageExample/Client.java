package structuralDesignPattern.compositeDesignPattern.carGarageExample;

public class Client {
    public static void main(String[] args) {
        //this code is not at the best because if you will look at it closely it is actually not following LSP.
        ParkedCars bmw = new ParkedCar("BMW");
        ParkedCars audi = new ParkedCar("Audi");
        ParkedCars tata = new ParkedCar("tata");
        ParkedCars mahindra = new ParkedCar("mahindra");
        ParkedCars jeep = new ParkedCar("Jeep");

        CompositeParkedCar garage1 = new CompositeParkedCar();
        garage1.addCar(bmw);
        garage1.addCar(audi);

        CompositeParkedCar garage2 = new CompositeParkedCar();
        garage2.addCar(tata);

        CompositeParkedCar floor = new CompositeParkedCar();
        floor.addCar(garage1);
        floor.addCar(garage2);

        CompositeParkedCar garage3 = new CompositeParkedCar();
        garage3.addCar(mahindra);
        garage3.addCar(jeep);

        CompositeParkedCar floor2 = new CompositeParkedCar();
        floor2.addCar(garage3);

        CompositeParkedCar building1 = new CompositeParkedCar();
        building1.addCar(floor);
        building1.addCar(floor2);

        building1.checkHeadLights();
        building1.checkLock();
    }
}
