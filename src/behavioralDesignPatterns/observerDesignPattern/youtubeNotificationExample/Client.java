package behavioralDesignPatterns.observerDesignPattern.youtubeNotificationExample;

public class Client {
    public static void main(String[] args) {
        YoutubeChannelImp myYoutubeChannel = new YoutubeChannelImp();
        Subscriber satwik = new Subscriber("satwik");
        satwik.addStrategy(new EmailNotification());
        satwik.addStrategy(new PushNotification());

        Subscriber pawan = new Subscriber("pawan");
        pawan.addStrategy(new PushNotification());

        myYoutubeChannel.addSubscriber(satwik);
        myYoutubeChannel.addSubscriber(pawan);

        myYoutubeChannel.uploadNewVideo("observer design pattern");
    }
}
