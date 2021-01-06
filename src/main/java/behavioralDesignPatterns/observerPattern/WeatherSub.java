package behavioralDesignPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherStation knows nothing about Observer
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
    public void notifyAllObs() {
        for(Observer o: this.oList){
            //update() coming from Subject class
            o.update(pres, temp);
        }
    }

    public void setPres(int pres) {
        this.pres = pres;
        notifyAllObs();
    }

    public void setTemp(int temp) {
        this.temp = temp;
        notifyAllObs();
    }
}
