package structuralDesignPattern.facadeDesignPattern.orderExample;


public class Client{

    public static void main (String[] args) {
        Operator op = new Operator();
        op.completeOrder();
    }
}