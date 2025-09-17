package creationalDesignPatterns.factoryDesignPattern.milkshakeFactoryExample;

public class ButterScotchMilkShake implements MilkShake{
    private final MilkShakeType milkShakeType = MilkShakeType.butterscotch;

    @Override
    public void greet() {
        System.out.println("this is " + milkShakeType + " of milkshake!");
    }
}
