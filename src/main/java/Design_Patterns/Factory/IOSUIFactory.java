package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.Button;
import Design_Patterns.Factory.Components.Button.IOSButton;
import Design_Patterns.Factory.Components.DropDown.DropDown;
import Design_Patterns.Factory.Components.DropDown.IOSDropDown;
import Design_Patterns.Factory.Components.Menu.IOSMenu;
import Design_Patterns.Factory.Components.Menu.Menu;

public class IOSUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton().getButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu().getMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown().getDropDown();
    }
}
