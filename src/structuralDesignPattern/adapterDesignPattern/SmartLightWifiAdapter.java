package structuralDesignPattern.adapterDesignPattern;

public class SmartLightWifiAdapter implements SmartDevice{
    private final SmartLight smartLight;

    public SmartLightWifiAdapter(SmartLight smartLight){
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectToWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
        smartLight.switchOff();
        smartLight.disconnectWiFi();
    }
}
