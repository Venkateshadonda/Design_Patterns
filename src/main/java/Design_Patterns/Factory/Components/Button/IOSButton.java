package Design_Patterns.Factory.Components.Button;

public class IOSButton implements Button {
    public Button getButton(){
        System.out.println("IOSButton");
        return new IOSButton();
    }
}
