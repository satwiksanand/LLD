package behavioralDesignPatterns.commandDesignPattern.remoteExample;

public class OnCommand implements Command {
    private final Device device;

    public OnCommand(final Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.on();
    }
}

