package behavioralDesignPatterns.DataAccess;

public class App {
    public static void main(String[] args) {
        Database db = new Database();
        db.insert(new Person("elyse",1));
        db.insert(new Person("e",2));
        db.insert(new Person("l",3));
        db.insert(new Person("y",4));

        for (Person p: db.getPeople()){
            System.out.println(p);
        }

    }
}
