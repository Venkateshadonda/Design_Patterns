package Design_Patterns.Factory.Components.Menu;

public class WindowsMenu implements Menu{
    @Override
    public Menu getMenu() {
        System.out.println("Showing WindowsMenu");
        return new WindowsMenu();
    }
}
