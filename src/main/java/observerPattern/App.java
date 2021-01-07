package observerPattern;

public class App {

    public static void main(String[] args) {
        StockSub sub1 = new StockSub();
        StockOb ob1 = new StockOb(sub1);

        sub1.setAppl(123.30);
    }



//    http://www.newthinktank.com/2012/08/observer-design-pattern-tutorial/

}
