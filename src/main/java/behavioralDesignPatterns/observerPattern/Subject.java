package behavioralDesignPatterns.observerPattern;

public interface Subject {
    public void addObs(Observer o);

    public void notifyAllObs();
}
