package behavioralDesignPatterns.templateDesignPattern.drinksExample;

public class Coffee extends Drinks{

    @Override
    public void brew() {
        System.out.println("brew coffee!");
    }

    @Override
    public void serve() {
        System.out.println("serve coffee!");
    }
}
