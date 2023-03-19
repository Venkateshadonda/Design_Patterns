package Design_Patterns.Decorator;

public class ChocolateSyrup implements IceCream{
    IceCream iceCream;

    public ChocolateSyrup(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+100;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+" + Chocolate Syrup";
    }
}
