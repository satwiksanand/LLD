package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

import java.util.*;

public class YoutubeChannelImp implements YoutubeChannel{
   Set<Subscriber> allSubscribers;

   public YoutubeChannelImp(){
       allSubscribers = new HashSet<>();
   }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        allSubscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        allSubscribers.remove(subscriber);
    }

    @Override
    public void uploadNewVideo(String video) {
        System.out.println("new video uploaded!");
        this.sendNotification(video);
    }

    @Override
    public void sendNotification(String video) {
        for(Subscriber subscriber : allSubscribers){
            subscriber.notifySubscriber(video);
        }
    }
}
