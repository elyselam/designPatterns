package behavioralDesignPatterns.observerPattern;

import java.util.List;

public class WeatherStation implements Subject{

    private int pressure;
    private int temp;
    private int humidity;
    private List<Observer> observerList;

    public WeatherStation(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addObserver(Observer o) {
        this.observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observerList.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(Observer o: this.observerList){
            o.update(pressure, temp, humidity);
        }
    }


    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObservers();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyAllObservers();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObservers();
    }
}
