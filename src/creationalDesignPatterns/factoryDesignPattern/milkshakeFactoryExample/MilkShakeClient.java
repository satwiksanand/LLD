package creationalDesignPatterns.factoryDesignPattern.milkshakeFactoryExample;

public class MilkShakeClient {
    public static void main(String[] args) {
        MilkShakeFactory factory = new MilkShakeFactory();
        MilkShake butter = factory.prepare(MilkShakeType.butterscotch);
        butter.greet();

        MilkShake choco = factory.prepare(MilkShakeType.chocolate);
        choco.greet();

        MilkShake vanilla = factory.prepare(MilkShakeType.vanilla);
        vanilla.greet();
    }
}
