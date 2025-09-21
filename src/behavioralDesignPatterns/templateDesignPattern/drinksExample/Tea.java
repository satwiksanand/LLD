package behavioralDesignPatterns.templateDesignPattern.drinksExample;

public class Tea extends Drinks{

    @Override
    public void brew() {
        System.out.println("making tea");
    }

    @Override
    public void serve() {
        System.out.println("serving tea");
    }
}
