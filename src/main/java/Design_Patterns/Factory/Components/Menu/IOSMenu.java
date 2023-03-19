package Design_Patterns.Factory.Components.Menu;

public class IOSMenu implements Menu {
    @Override
    public Menu getMenu() {

        System.out.println("IOSMenu");
        return new IOSMenu();
    }
}
