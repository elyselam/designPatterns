package behavioralDesignPatterns.observerPattern;

/**
 * - subject to observers (1 to many) dependency, if 1 object changes state, all dependents are notified
 * - loose coupling: 2 objects have little knowledge of each other, subject knows observer implements a certain interface
 * - can add observers whenever by implementing Observer interface, no need to modifying subject
 * - can change both independently
 *
 *
 * WeatherStation & WeatherObserver know very little of each other
 */

public class App {
    public static void main(String[] args) {
        WeatherSub station = new WeatherSub();
        //set observer to observe weather station
        WeatherObs observer = new WeatherObs(station);

        station.setPres(2);
        station.setTemp(3);

    }
}
