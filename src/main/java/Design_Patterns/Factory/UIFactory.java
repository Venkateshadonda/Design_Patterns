package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.Button;
import Design_Patterns.Factory.Components.DropDown.DropDown;
import Design_Patterns.Factory.Components.Menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public DropDown createDropDown();
}
