package Design_Patterns.Strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        PathCalculatorStrategy pc=PathCalculatorFactory.getPathCalculator(Mode.BIKE);
        pc.findPath("Hyd", "Chennai");
    }
}
