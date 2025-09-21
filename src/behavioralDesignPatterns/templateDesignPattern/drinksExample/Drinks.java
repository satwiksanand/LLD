package behavioralDesignPatterns.templateDesignPattern.drinksExample;

public abstract class Drinks {
    public void addSugar(){
        System.out.println("add sugar");
    }

    public void boilWater(){
        System.out.println("boiling water!");
    }

    public abstract void brew();
    public abstract void serve();

    public final void prepare(){
        boilWater();
        addSugar();
        brew();
        serve();
    }
}
