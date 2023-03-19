package Design_Patterns.Decorator;

public class StrawberryScoop implements IceCream{
    IceCream iceCream;

    public StrawberryScoop(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+70;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+" + Strawberry Scoop";
    }
}
