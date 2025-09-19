package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {
    String name;
    List<NotificationStrategy> allStrategies;

    public Subscriber(String name){
        this.name = name;
        allStrategies = new ArrayList<>();
    }

    public void addStrategy(NotificationStrategy notificationStrategy){
        allStrategies.add(notificationStrategy);
    }

    public void notifySubscriber(String newVideo){
        for(NotificationStrategy notificationStrategy : allStrategies){
            notificationStrategy.notifySubscribers(newVideo);
        }
    }
}
