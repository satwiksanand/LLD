package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public interface TrafficStateContext {
    void next();
    void performOperation();
    void setState(TrafficState trafficState);
}
