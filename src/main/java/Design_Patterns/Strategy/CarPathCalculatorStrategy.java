package Design_Patterns.Strategy;

import java.nio.file.Path;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    private static CarPathCalculatorStrategy instance;

    private CarPathCalculatorStrategy(){}

    public static CarPathCalculatorStrategy getInstance(){
        if(instance==null)
                instance=new CarPathCalculatorStrategy();
        return instance;
    }
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Using Car Path from "+source+" to "+destination);
    }
}
