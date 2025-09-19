package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public class GreenTrafficState implements TrafficState{

    @Override
    public void next(TrafficStateContext trafficStateContext) {
        trafficStateContext.setState(new YelloTrafficState());
    }

    @Override
    public void execute() {
        System.out.println("this is the green traffic state!");
    }
}
