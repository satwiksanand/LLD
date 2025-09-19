package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public class EmailNotification implements NotificationStrategy{
    @Override
    public void notifySubscribers(String newVideo){
        System.out.println("notifying user via Email " + newVideo + " is uploaded");
    }
}
