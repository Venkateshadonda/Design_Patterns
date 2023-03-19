package Design_Patterns.Observer_Pattern;

import Design_Patterns.Observer_Pattern.Observable.Channel1;
import Design_Patterns.Observer_Pattern.Observable.Channel2;
import Design_Patterns.Observer_Pattern.Observable.YoutubeAccount;
import Design_Patterns.Observer_Pattern.Observer.Subscriber;
import Design_Patterns.Observer_Pattern.Observer.Subscriber1;
import Design_Patterns.Observer_Pattern.Observer.Subscriber2;
import Design_Patterns.Observer_Pattern.Observer.Subscriber3;

public class Youtube {
    public static void main(String[] args) {
        YoutubeAccount Venkat= Channel1.getInstance();
        YoutubeAccount Raji= Channel2.getInstance();


        Subscriber Lavanya= Subscriber1.getInstance();
        Lavanya.subscribe(Venkat);
        Lavanya.subscribe(Raji);

        Subscriber Sathya= Subscriber2.getInstance();
        Sathya.subscribe(Venkat);
        Sathya.subscribe(Raji);

        Subscriber Yadagiri= Subscriber3.getInstance();
        Yadagiri.subscribe(Venkat);
        Yadagiri.subscribe(Raji);


        Venkat.uploadVideo("Start Java with this 3 Steps!!");
        Raji.uploadVideo("My Home Tour!!");

        Lavanya.unSubscribe(Raji);
        Yadagiri.unSubscribe(Venkat);

        Venkat.uploadVideo("Neeyansh Becoming IAS");
        Raji.uploadVideo("Tarnija Achieving Doctor Cerficate!!");
    }
}
