package behavioralDesignPatterns.stateDesignPattern.trafficStateExample;

public class TrafficStateContextImpl implements TrafficStateContext{

    private TrafficState currentTrafficState;

    public TrafficStateContextImpl(TrafficState trafficState){
        this.currentTrafficState = trafficState;
    }

    @Override
    public void next() {
        currentTrafficState.next(this);
    }

    @Override
    public void performOperation() {
        currentTrafficState.execute();
    }

    @Override
    public void setState(TrafficState trafficState) {
        currentTrafficState = trafficState;
    }
}
