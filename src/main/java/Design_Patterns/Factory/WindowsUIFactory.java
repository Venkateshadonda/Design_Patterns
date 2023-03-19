package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.Button;
import Design_Patterns.Factory.Components.Button.WindowsButton;
import Design_Patterns.Factory.Components.DropDown.DropDown;
import Design_Patterns.Factory.Components.DropDown.WindowsDropDown;
import Design_Patterns.Factory.Components.Menu.Menu;
import Design_Patterns.Factory.Components.Menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton().getButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu().getMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown().getDropDown();
    }
}
