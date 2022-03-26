package StrategyPattern;

public class StrategyDriver {
    public static void main(String[] args) {
        Strategy defaultStrategy = new WalkStrategy();
        Navigator navigator = new Navigator(defaultStrategy);
        navigator.calculateRoute();
        navigator.setStrategy(new DriveStrategy());
        navigator.calculateRoute();
    }
}
