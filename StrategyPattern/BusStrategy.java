package StrategyPattern;

public class BusStrategy implements Strategy{
    @Override
    public void calculateRoute() {
        System.out.println("Use Bus Strategy to choose route!");
    }
}
