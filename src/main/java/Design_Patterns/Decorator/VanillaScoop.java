package Design_Patterns.Decorator;

public class VanillaScoop implements IceCream{
    IceCream iceCream;

    public VanillaScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+60;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+" + Vanilla Scoop";
    }
}
