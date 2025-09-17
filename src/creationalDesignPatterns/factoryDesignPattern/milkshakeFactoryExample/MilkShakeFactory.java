package creationalDesignPatterns.factoryDesignPattern.milkshakeFactoryExample;

import java.util.HashMap;
import java.util.Map;

public class MilkShakeFactory {
    private Map<MilkShakeType, MilkShake> milkShakeMenu;
    public MilkShakeFactory(){
        buildMilkShakeMenu();
    }

    public MilkShake prepare(MilkShakeType type){
        if(type == null){
            System.out.println("please provide a valid milkshake type.");
            return null;
        }
        System.out.println("preparing...");
        return milkShakeMenu.get(type);
    }

    private void buildMilkShakeMenu(){
        milkShakeMenu = new HashMap<>();
        milkShakeMenu.put(MilkShakeType.butterscotch, new ButterScotchMilkShake());
        milkShakeMenu.put(MilkShakeType.chocolate, new ChocolateMilkShake());
        milkShakeMenu.put(MilkShakeType.vanilla, new VanillaMilkShake());
    }
}
