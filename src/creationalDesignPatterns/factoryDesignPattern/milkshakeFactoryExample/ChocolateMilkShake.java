package creationalDesignPatterns.factoryDesignPattern.milkshakeFactoryExample;

public class ChocolateMilkShake implements MilkShake{
    private final MilkShakeType milkShakeType = MilkShakeType.chocolate;

    @Override
    public void greet() {
        System.out.println("this is " + milkShakeType + " of milkshake!");
    }
}
