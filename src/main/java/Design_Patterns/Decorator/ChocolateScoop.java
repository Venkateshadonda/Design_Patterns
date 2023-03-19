package Design_Patterns.Decorator;

public class ChocolateScoop implements IceCream{
    IceCream iceCream;

    public ChocolateScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+80;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+" + Chocolate Scoop";
    }
}
