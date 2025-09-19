package behavioralDesignPatterns.commandDesignPattern.remoteExample;

public class Client {
    public static void main(String[] args) {
        final Light light = new Light();

        final Invoker invoker = new Invoker(
                new OnCommand(light),
                new OffCommand(light),
                new UpCommand(light),
                new DownCommand(light)
        );

        invoker.clickOn();
        invoker.clickOff();
        invoker.clickUp();
        invoker.clickDown();
    }
}

