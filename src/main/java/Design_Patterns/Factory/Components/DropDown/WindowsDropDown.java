package Design_Patterns.Factory.Components.DropDown;

public class WindowsDropDown implements DropDown{
    @Override
    public DropDown getDropDown() {
        System.out.println("Showing WindowsDropDow");
        return new WindowsDropDown();
    }
}
