package behavioralDesignPatterns.strategyDesignPattern.paymentExample;

public class CreditPayment implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("paying via credit card.");
    }
}
