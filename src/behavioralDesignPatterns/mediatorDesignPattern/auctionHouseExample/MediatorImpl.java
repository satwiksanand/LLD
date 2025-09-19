package behavioralDesignPatterns.mediatorDesignPattern.auctionHouseExample;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator{
    private final List<Bidder> allBidders;
    Bidder highestBidder;
    int highestAmount = 0;

    public MediatorImpl(){
        allBidders = new ArrayList<>();
    }

    @Override
    public void registerBidder(Bidder bidder) {
        //it is a simple use case obviously there are a lot of bugs like there can be a case where same bidder is added multiple times.
        allBidders.add(bidder);
    }

    @Override
    public void registerABid(Bidder bidder, int amount) {
        if(amount <= highestAmount){
            bidder.notifyBidder("Someone already has made a bid of " + highestAmount + ".");
            return;
        }
        else if(bidder == highestBidder){
            bidder.notifyBidder("you already have the highest bid");
            return ;
        }
        highestBidder = bidder;
        highestAmount = amount;
        bidder.notifyBidder("Bid Successfully registered.");
        this.notifyAllBidders();
    }

    @Override
    public void notifyAllBidders() {
        String message = "Bid placed for " + highestAmount + ".";
        for(Bidder bidder : allBidders){
            if(bidder != highestBidder){
                bidder.notifyBidder(message);
            }
        }
    }
}
