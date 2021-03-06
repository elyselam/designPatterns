package behavioralDesignPatterns.observerPattern;

/**
 * obs don't know about concrete implementation of Sub
 * just have update() method that is called
 */
public class WeatherObs implements Observer{
    private int pres;
    private int temp;
    private Subject subject;

    public WeatherObs(Subject subject) {
        this.subject = subject;
        this.subject.addObs(this);
    }

    public void update(int pres, int temp) {
        this.pres = pres;
        this.temp = temp;

        showData();
    }
    private void showData(){
        System.out.println("pres: "+ this.pres + ", temp: "+this.temp);
    }
}
