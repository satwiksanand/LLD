package creationalDesignPatterns.builderDesignPattern;

//NOTE: make the constructor of CarBuilder as private, that would stop others from directly instantiating this class.
//in case of overloading the return type can differ but the parameter list must differ on the other hand for overriding the whole method signature(return type, parameter list and types) must be same only the method body can differ.

public class Car {
    private final String carName;
    private final int distanceTravelled;
    private final String engine;
    private final boolean isElectrical;
    private final boolean isFourWheelControlled;

    private Car(CarBuilder carBuilder){
        this.carName = carBuilder.carName;
        this.distanceTravelled = carBuilder.distanceTravelled;
        this.engine = carBuilder.engine;
        this.isFourWheelControlled = carBuilder.isFourWheelControlled;
        this.isElectrical = carBuilder.isElectrical;
    }

    public String getCarName(){
        return this.carName;
    }

    public String getEngine(){
        return this.engine;
    }

    public int getDistanceTravelled(){
        return this.distanceTravelled;
    }

    public boolean getIsElectrical(){
        return this.isElectrical;
    }

    public boolean getIsFourWheelControlled(){
        return this.isFourWheelControlled;
    }

    public static CarBuilder builder(){
        return new CarBuilder();
    }

    @Override
    public String toString(){
        return "carName: " + this.carName + " engineName: -> " + this.engine + " distance travelled is " + this.distanceTravelled + ".";
    }

    public static class CarBuilder{
        private String carName = "dummy name";
        private int distanceTravelled = 0;
        private String engine = "engine name";
        private boolean isElectrical = false;
        private boolean isFourWheelControlled = false;

        private CarBuilder(){

        }

        public CarBuilder carName(String name){
            this.carName = name;
            return this;
        }

        public CarBuilder distanceTravelled(int dist){
            this.distanceTravelled = dist;
            return this;
        }

        public CarBuilder engine(String engineName){
            this.engine = engineName;
            return this;
        }

        public CarBuilder isElectrical(boolean elec){
            this.isElectrical = elec;
            return this;
        }

        public CarBuilder isFourWheelControlled(boolean fourWheel){
            this.isFourWheelControlled = fourWheel;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
