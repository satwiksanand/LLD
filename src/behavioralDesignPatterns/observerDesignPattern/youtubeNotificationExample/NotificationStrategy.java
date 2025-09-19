package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public interface NotificationStrategy {
    void notifySubscribers(String newVideo);
}
