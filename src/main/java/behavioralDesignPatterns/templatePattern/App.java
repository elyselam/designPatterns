package behavioralDesignPatterns.templatePattern;

/**
 * abstract: exposes defined template to execute its methods
 * subclasses can override methods but the invocation has to be the same
 *
 * abstract class Game() {
 *     abstract void initialize();
 *     abstract void startGame();
 *     abstract void finishGame();
 * }
 *
 * }
 */
public class App {

    public static void main(String[] args) {
        int[] numbers = {1,5,3,8,2};
        Algorithm bubbles = new BubbleSort(numbers);
        bubbles.sort();
    }
}
