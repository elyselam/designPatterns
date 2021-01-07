package behavioralDesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherStation knows nothing about Observer
 * only has a list of observers
 * when a given parameter changes, it notifies Obs
 */
public class WeatherSub implements Subject{

    private int pres;
    private int temp;

    private List<Observer> oList;

    public WeatherSub(List<Observer> oList) {
        this.oList = new ArrayList<>();
    }

    public WeatherSub() {
    }

    @Override
    public void addObs(Observer o) {
        this.oList.add(o);
    }

    @Override
    public void notifyObs() {
        for(Observer o: this.oList){
            //update() coming from Subject class
            o.update(pres, temp);
        }
    }

    public void setPres(int pres) {
        this.pres = pres;
        notifyObs();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyObs();
    }
}
