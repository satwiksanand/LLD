package structuralDesignPattern.adapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        SmartDevice airConditionerAdapter = new AirConditionerBluetoothAdapter(new AirConditioner());
        SmartDevice smartLightAdapter = new SmartLightWifiAdapter(new SmartLight());
        SmartDevice coffeeMachineAdapter = new CoffeeMachineZigbeeAdapter(new CoffeeMachine());

        airConditionerAdapter.turnOn();
        smartLightAdapter.turnOn();
        coffeeMachineAdapter.turnOn();

        coffeeMachineAdapter.turnOff();
        airConditionerAdapter.turnOff();
        smartLightAdapter.turnOff();
    }
}
