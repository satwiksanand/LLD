package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public interface YoutubeChannel {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void uploadNewVideo(String video);
    void sendNotification(String video);
}
