package dependencyInjection;


/**
 * high level modules shouldn't depend on low level ones
 * both should depend on abstraction, no detail
 * Animal dog = new Dog()
 *
 * avoid tightly coupled code, creating an object of a class with new keyword results in a class being tightly coupled
 *helps create loosely coupled modules, different packages know nothing about each other
 * Person class shouldn't depend on Address class,
 * public class Person {
 *     private Address address;
 *     public Person() {
 *         this.address = new Address();  <= tightly coupled, bad
 *     }
 * }
 *
 *
 * can impleement inverson of control in these ways:
 * - design patterns: facotry, template, strategy
 * - service locator pattern
 * - using dependency injection
 */
public class App {
    public static void main(String[] args) {
//        DbHandler dbHandler = new DbHandler();
//        dbHandler.connect();

        DbHandler dbHandler = new DbHandler(new MySql());  // <== injects MySql's behavior into constructor
        dbHandler.connect();
    }
}
