package creationalDesignPattern.builder;

public class App {
    public static void main(String[] args) {
        User user = new User.Builder("elyse", "butt@gmail").lastName("buttface").build();
        System.out.println(user);
    }
}
