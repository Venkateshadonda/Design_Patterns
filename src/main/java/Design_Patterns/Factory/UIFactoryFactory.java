package Design_Patterns.Factory;

public class UIFactoryFactory {
    public static UIFactory createUI(Platform platform){
        if(platform.equals(Platform.ANDRIOD))
            return new AndroidUIFactory();
        else if(platform.equals(Platform.IOS))
            return new IOSUIFactory();
        else if(platform.equals(Platform.WINDOWS))
            return new WindowsUIFactory();
        return null;
    }
}
