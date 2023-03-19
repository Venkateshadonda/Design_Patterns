package Design_Patterns.Singleton_Design_Pattern;

public class SingletonMultithread {
    private static SingletonMultithread instance;

    private SingletonMultithread(){}

    public static SingletonMultithread getInstance(){
        if(instance==null){
            synchronized (SingletonMultithread.class){
                if(instance==null)
                        instance=new SingletonMultithread();
            }
        }
        return instance;
    }
}
