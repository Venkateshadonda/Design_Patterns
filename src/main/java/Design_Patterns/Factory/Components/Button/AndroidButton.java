package Design_Patterns.Factory.Components.Button;

public class AndroidButton implements Button {
    @Override
    public Button getButton() {
        System.out.println("AndriodButton");
        return new AndroidButton();
    }
}
