package observerPattern;

public interface Sub {
    public void addOb(Ob o);
    public void removeOb(Ob o);
    public void notifyObs();
}
