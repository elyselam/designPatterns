package observerPattern;

public class StockOb implements Ob{

    private double appl, googl;

    private static int obIDTracker = 0;
    private int obID;
    private Sub stockSub;

    public StockOb(Sub stockSub) {
        this.stockSub = stockSub;
        this.obID = ++obIDTracker;
        System.out.println("new observer " +this.obID);
        stockSub.addOb(this);
    }

    @Override
    public void update(double aapl, double googl) {
        this.appl = aapl;
        this.googl = googl;
        printPrices();
    }

    private void printPrices() {
        System.out.println(obID + " applPrice: " + appl + " googlePrice " + googl);
    }
}
