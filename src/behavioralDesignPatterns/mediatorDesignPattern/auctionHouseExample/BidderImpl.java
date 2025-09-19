package behavioralDesignPatterns.mediatorDesignPattern.auctionHouseExample;

public class BidderImpl implements Bidder{
    String bidderName;
    Mediator mediator;

    public BidderImpl(String name, Mediator mediator){
        this.bidderName = name;
        this.mediator = mediator;
    }

    @Override
    public void makeABid(int amount) {
        mediator.registerABid(this, amount);
    }

    @Override
    public void notifyBidder(String message) {
        System.out.println(message);
    }
}
