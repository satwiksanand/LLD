package behavioralDesignPatterns.strategyDesignPattern.paymentExample;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(){
        this.paymentStrategy.processPayment();
    }
}
