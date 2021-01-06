package behavioralDesignPatterns.StrategyPattern;


public class Manager implements Strategy {

    //allows manager to operate without knowing the details
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.strategy.operation(num1, num2);
    }
}
