package structuralDesignPattern.adapterDesignPattern;

public class CoffeeMachineZigbeeAdapter implements SmartDevice{
    private final CoffeeMachine coffeeMachine;
    public CoffeeMachineZigbeeAdapter(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn(){
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff(){
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
}
