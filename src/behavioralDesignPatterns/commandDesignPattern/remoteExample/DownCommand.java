package behavioralDesignPatterns.commandDesignPattern.remoteExample;

public class DownCommand implements Command {
    private final Device device;

    public DownCommand(final Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        this.device.down();
    }
}
