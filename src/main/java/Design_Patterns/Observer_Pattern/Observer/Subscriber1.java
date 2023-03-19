package Design_Patterns.Observer_Pattern.Observer;

import Design_Patterns.Observer_Pattern.Observable.YoutubeAccount;

public class Subscriber1 implements Subscriber {
    private int Name;

    public int getName() {
        return Name;
    }

    public void setName(int name) {
        Name = name;
    }

    private static Subscriber instance;

    private Subscriber1(){}

    public static Subscriber getInstance(){
        if(instance==null){
            synchronized (Subscriber1.class){
                if(instance==null)
                        instance=new Subscriber1();
            }
        }
        return instance;
    }
    @Override
    public void getNotified() {
        System.out.println("Hey I am "+instance.getClass()+" Commenting As Good Video!!");
    }
    public void subscribe(YoutubeAccount youtubeAccount){
        youtubeAccount.subscribe(this);
    }
    public void unSubscribe(YoutubeAccount youtubeAccount){
        youtubeAccount.unSubscribe(this);
    }
}
