package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public class PushNotification implements NotificationStrategy{

    @Override
    public void notifySubscribers(String newVideo){
        System.out.println("notifying user via push notification " + newVideo + " is uploaded");
    }
}
