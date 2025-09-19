package behavioralDesignPatterns.mediatorDesignPattern.auctionHouseExample;

public interface Bidder {
    void makeABid(int amount);
    void notifyBidder(String message);
}
