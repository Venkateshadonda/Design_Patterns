package Design_Patterns.Factory;

public class Flutter {
    private Platform platform;


    Flutter(Platform platform){
        this.platform=platform;
    }

    public void setTheme(String theme){
        System.out.println("Theme is Set to "+theme);
    }
    public void setRefreshRate(int refreshRate){
        System.out.println("Refresh Rate is set to "+refreshRate);
    }

    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUI(platform);
    }
}
