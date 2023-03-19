package Design_Patterns.Decorator;

public class ChocolateCone implements IceCream{
    IceCream iceCream;

    public ChocolateCone(){

    }

    public ChocolateCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+40;
        return 40;
    }

    @Override
    public String getDesc() {
        if(iceCream!=null)
            return iceCream.getDesc()+" + Chocolate Cone";
        return "Chocolate Cone";
    }
}
