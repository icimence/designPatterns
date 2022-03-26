package StrategyPattern;

public class Navigator {
    private Strategy strategy;

    public Navigator(Strategy strategy){
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void calculateRoute(){
        strategy.calculateRoute();
    }
}
