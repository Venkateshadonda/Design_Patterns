package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.AndroidButton;
import Design_Patterns.Factory.Components.Button.Button;
import Design_Patterns.Factory.Components.DropDown.AndroidDropDown;
import Design_Patterns.Factory.Components.DropDown.DropDown;
import Design_Patterns.Factory.Components.Menu.AndroidMenu;
import Design_Patterns.Factory.Components.Menu.Menu;

public class AndroidUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new AndroidButton().getButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu().getMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown().getDropDown();
    }
}
