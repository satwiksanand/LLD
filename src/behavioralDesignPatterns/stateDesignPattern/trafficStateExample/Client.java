package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public class Client {
    public static void main(String[] args) {
        TrafficStateContextImpl currentState = new TrafficStateContextImpl(new RedTrafficState());
        currentState.performOperation();

        currentState.next();
        currentState.performOperation();

        currentState.next();
        currentState.performOperation();

        //you can also now go and add new states, this pattern now follows the open/closed principle and hence maintaining such code is easier.
    }
}
