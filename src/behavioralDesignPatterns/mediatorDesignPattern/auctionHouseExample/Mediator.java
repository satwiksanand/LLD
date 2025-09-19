package behavioralDesignPatterns.mediatorDesignPattern.auctionHouseExample;

public interface Mediator {
    void registerBidder(Bidder bidder);
    void registerABid(Bidder bidder, int amount);
    void notifyAllBidders();
}
