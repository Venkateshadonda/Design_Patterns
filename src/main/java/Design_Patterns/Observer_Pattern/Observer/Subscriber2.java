package Design_Patterns.Observer_Pattern.Observer;

import Design_Patterns.Observer_Pattern.Observable.YoutubeAccount;

public class Subscriber2 implements Subscriber {
    private static Subscriber instance;

    private Subscriber2(){}

    public static Subscriber getInstance(){
        if(instance==null){
            synchronized (Subscriber2.class){
                if(instance==null)
                    instance=new Subscriber2();
            }
        }
        return instance;
    }
    @Override
    public void getNotified() {
        System.out.println("Hey I am "+instance+" Commenting As Good Video!!");
    }
    public void subscribe(YoutubeAccount youtubeAccount){
        youtubeAccount.subscribe(this);
    }
    public void unSubscribe(YoutubeAccount youtubeAccount){
        youtubeAccount.unSubscribe(this);
    }
}
