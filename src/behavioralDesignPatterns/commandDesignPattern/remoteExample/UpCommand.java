package behavioralDesignPatterns.commandDesignPattern.remoteExample;

public class UpCommand implements Command {
    private final Device device;

    public UpCommand(final Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.up();
    }
}
