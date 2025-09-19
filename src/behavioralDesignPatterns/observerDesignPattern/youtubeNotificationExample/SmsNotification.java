package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public class SmsNotification implements NotificationStrategy{

    @Override
    public void notifySubscribers(String newVideo){
        System.out.println("notifying user via SMS " + newVideo + " is uploaded");
    }
}
