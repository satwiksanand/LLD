package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public class YelloTrafficState implements TrafficState{

    @Override
    public void next(TrafficStateContext trafficStateContext) {
        trafficStateContext.setState(new RedTrafficState());
    }

    @Override
    public void execute() {
        System.out.println("this is the yellow traffic state!");
    }
}
