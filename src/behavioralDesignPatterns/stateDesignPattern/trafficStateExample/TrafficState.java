package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public interface TrafficState {
    void next(TrafficStateContext trafficStateContext);
    void execute();
}
