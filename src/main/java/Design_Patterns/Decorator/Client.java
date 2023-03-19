package Design_Patterns.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic=new ChocoChip(
                new ChocolateScoop(
                        new VanillaScoop(
                                new ChocolateSyrup(
                                        new VanillaScoop(
                                                new OrangeCone()
                                        )
                                )
                        )
                )
        );
        System.out.println(ic.getCost());
        System.out.println(ic.getDesc());
    }
}
