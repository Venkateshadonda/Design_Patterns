package Design_Patterns.Observer_Pattern.Observer;

import Design_Patterns.Observer_Pattern.Observable.YoutubeAccount;

public interface Subscriber {
    public void getNotified();
    public void subscribe(YoutubeAccount youtubeAccount);
    public void unSubscribe(YoutubeAccount youtubeAccount);
}
