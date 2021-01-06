package behavioralDesignPatterns.StrategyPattern;

/**
 * takes what varies and encapsulate it
 * actual runtime object is not locked into the code
 * programming to an Interface: Animal dog = new Dog();
 *
 *
 * favor composition (has-a) over inheritance (is-a):
 * composition: Has-a relationship (gives more flexibility
 *      - can encapsulate into their own set of classes
 *      - can change behavior at runtime with interfaces
 *
 * class Book{
 *     private Writer writer;
 * }
 *
 *
 */
public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();

        //set strategy at runtime
        manager.setStrategy(new Multiply());
        //manager's operations is flexible on any strategy
        manager.operation(2,5);
    }
}
