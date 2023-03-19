package Design_Patterns.Factory.Components.Button;

public class WindowsButton implements Button{

    @Override
    public Button getButton() {
        System.out.println("Showing WindowsButton");
        return new WindowsButton();
    }
}
