package creationalDesignPatterns.factoryDesignPattern.milkshakeFactoryExample;

public class VanillaMilkShake implements MilkShake{
    private final MilkShakeType milkShakeType = MilkShakeType.vanilla;


    @Override
    public void greet() {
        System.out.println("this is " + milkShakeType + " of milkshake!");
    }
}
