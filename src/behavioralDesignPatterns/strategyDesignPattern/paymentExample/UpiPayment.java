package behavioralDesignPatterns.strategyDesignPattern.paymentExample;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("paying via UPI.");
    }
}
