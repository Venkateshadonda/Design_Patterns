package Design_Patterns.Factory.Components.DropDown;

public class IOSDropDown implements DropDown{
    @Override
    public DropDown getDropDown() {
        System.out.println("IOSDropDown");
        return new IOSDropDown();
    }
}
