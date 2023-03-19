package Design_Patterns.Observer_Pattern.Observable;

import Design_Patterns.Observer_Pattern.Observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Channel1 implements YoutubeAccount {
    private List<Subscriber> subscribers;
    private static YoutubeAccount instance;

    private Channel1(){
        subscribers=new ArrayList<>();
    }

    public static YoutubeAccount getInstance(){
        if(instance==null){
            synchronized (Channel1.class){
                if(instance==null)
                    instance=new Channel1();
            }
        }
        return instance;
    }
    @Override
    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void unSubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    @Override
    public void notifySubscribers() {
        for(Subscriber subscriber:subscribers)
            subscriber.getNotified();
    }

    @Override
    public void uploadVideo(String title) {
        System.out.println("Hey Dear Subscribers!! New Video with "+title+" is uploaded got.Please go check it out!!");
        notifySubscribers();
    }
}
