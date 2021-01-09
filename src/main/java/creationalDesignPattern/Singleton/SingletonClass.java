package creationalDesignPattern.Singleton;

//synchronized by default. thread safe

public enum SingletonClass {
    INSTANCE;
    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
