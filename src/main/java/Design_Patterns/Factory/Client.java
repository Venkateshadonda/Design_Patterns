package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.Button;
import Design_Patterns.Factory.Components.DropDown.DropDown;
import Design_Patterns.Factory.Components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter(Platform.WINDOWS);
        UIFactory uiFactory=flutter.createUIFactory();
        Button button=uiFactory.createButton();
        Menu menu=uiFactory.createMenu();
        DropDown dropDown=uiFactory.createDropDown();
    }
}
