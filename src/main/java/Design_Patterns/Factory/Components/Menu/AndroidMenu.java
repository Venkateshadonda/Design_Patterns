package Design_Patterns.Factory.Components.Menu;

public class AndroidMenu implements Menu {
    @Override
    public Menu getMenu() {
        System.out.println("AndroidMenu");
        return new AndroidMenu();
    }
}
