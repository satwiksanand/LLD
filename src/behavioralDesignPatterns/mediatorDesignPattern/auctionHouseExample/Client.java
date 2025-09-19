package behavioralDesignPatterns.mediatorDesignPattern.auctionHouseExample;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Bidder satwik = new BidderImpl("satwik", mediator);
        Bidder ayush = new BidderImpl("ayush", mediator);
        Bidder nitin = new BidderImpl("nitin", mediator);
        Bidder sohel = new BidderImpl("sohel", mediator);

        mediator.registerBidder(satwik);
        mediator.registerBidder(sohel);
        mediator.registerBidder(nitin);
        mediator.registerBidder(ayush);

        satwik.makeABid(25);

        satwik.makeABid(40);

        ayush.makeABid(10);

        nitin.makeABid(100);

        sohel.makeABid(25);

        satwik.makeABid(1000000);
    }
}
