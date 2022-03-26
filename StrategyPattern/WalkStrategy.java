package StrategyPattern;

public class WalkStrategy implements Strategy{
    @Override
    public void calculateRoute() {
        System.out.println("Use Walk Strategy to choose route!");
    }
}
