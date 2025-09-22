package structuralDesignPattern.facadeDesignPattern.orderExample;
public class Operator{

    private PlaceOrder placeOrder;
    private Payment payment;
    private Delivering delivering;

    public Operator(){
        placeOrder = new PlaceOrder();
        payment = new Payment();
        delivering = new Delivering();
    }

    public void completeOrder ( ) {
        placeOrder.orderStatus ( ) ;
        payment.payStatus ( ) ;
        delivering.deliverStatus ( ) ;
    }

}