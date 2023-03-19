package Design_Patterns.Decorator;

public class VanillaCone implements IceCream{
    IceCream iceCream;

    public VanillaCone(){

    }

    public VanillaCone(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream!=null)
            return iceCream.getCost()+55;
        return 55;
    }

    @Override
    public String getDesc() {
        if(iceCream!=null)
            return iceCream.getDesc()+" + Vanilla Cone";
        return "Vanilla Cone";
    }
}
