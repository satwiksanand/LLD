package structuralDesignPattern.adapterDesignPattern;

public class AirConditionerBluetoothAdapter implements SmartDevice{
    private final AirConditioner airConditioner;
    public AirConditionerBluetoothAdapter(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn(){
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff(){
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}
