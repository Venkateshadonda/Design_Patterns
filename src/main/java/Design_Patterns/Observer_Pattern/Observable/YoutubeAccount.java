package Design_Patterns.Observer_Pattern.Observable;

import Design_Patterns.Observer_Pattern.Observer.Subscriber;

public interface YoutubeAccount {
    public void subscribe(Subscriber sub);
    public void unSubscribe(Subscriber sub);
    public void notifySubscribers();
    public void uploadVideo(String title);
}
