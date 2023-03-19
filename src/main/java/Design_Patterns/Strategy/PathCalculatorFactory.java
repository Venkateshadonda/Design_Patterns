package Design_Patterns.Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(Mode mode){
        if(mode.equals(Mode.BIKE))
            return BikePathCalculatorStrategy.getInstance();
        else if(mode.equals(Mode.CAR))
            return CarPathCalculatorStrategy.getInstance();
        else if(mode.equals(Mode.WALK))
            return WalkPathCalculatorStrategy.getInstance();
        return null;
    }
}
