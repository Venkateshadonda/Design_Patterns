package Design_Patterns.Decorator;

public class ChocoChip implements IceCream{
    IceCream iceCream;

    public ChocoChip(IceCream iceCream){
        this.iceCream=iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost()+150;
    }

    @Override
    public String getDesc() {
        return iceCream.getDesc()+" + ChocoChip";
    }
}
