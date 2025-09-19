package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public class RedTrafficState implements TrafficState{
    @Override
    public void next(TrafficStateContext trafficStateContext) {
        trafficStateContext.setState(new GreenTrafficState());
    }

    @Override
    public void execute() {
        System.out.println("this is the red traffic state!");
    }
}
