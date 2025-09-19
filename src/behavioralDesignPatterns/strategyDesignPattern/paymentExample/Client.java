package behavioralDesignPatterns.strategyDesignPattern.paymentExample;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(new CreditPayment());
        paymentService.makePayment();

        paymentService.setPaymentStrategy(new UpiPayment());
        paymentService.makePayment();
    }
}
