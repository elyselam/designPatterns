package observerPattern;

import java.util.ArrayList;

public class StockSub implements Sub{

    public Ob Ob;
    private double appl, googl;
    private ArrayList<Ob> obList;

    //create an ArrayList to hold all obs

    public StockSub() {
        obList = new ArrayList<Ob>();
    }

    @Override
    public void addOb(Ob o) {
        obList.add(o);
    }

    @Override
    public void removeOb(Ob o) {
        int obIndex = obList.indexOf(o);
        obList.remove(obIndex);
        System.out.println("observer "+ (obIndex+1)+ " deleted");
    }

    @Override
    public void notifyObs() {
        for (Ob observer: obList){
            observer.update(appl, googl);
        }
    }

    public void setAppl(double appl) {
        this.appl = appl;
        notifyObs();
    }

    public void setGoogl(double googl) {
        this.googl = googl;
        notifyObs();
    }
}
