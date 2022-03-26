package StrategyPattern;

public class DriveStrategy implements Strategy {
    @Override
    public void calculateRoute() {
        System.out.println("Use Drive Strategy to choose route!");
    }
}
