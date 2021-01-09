package creationalDesignPattern.FactoryPattern;

/**
 * using New keyword: programming to an implementation, tying code to a concrete class makes it less flexible
 * we should program to an interface, polymorphism
 *
 *encapsulate object creation
 */
public class App {
    public static void main(String[] args) {
        Algorithm algorithm = AlgorithmFactory.createAlgo(AlgorithmFactory.SHORTEST_PATH);
        algorithm.solve();
    }
}
