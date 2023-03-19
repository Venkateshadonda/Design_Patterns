package Design_Patterns.Factory.Components.DropDown;

public class AndroidDropDown implements DropDown {
    @Override
    public DropDown getDropDown() {

        System.out.println("AndroidDropDown");
        return new AndroidDropDown();
    }
}
