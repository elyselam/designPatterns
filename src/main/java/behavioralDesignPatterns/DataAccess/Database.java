package behavioralDesignPatterns.DataAccess;
import java.util.ArrayList;
import java.util.List;

public class Database implements PersonDao {

    private List<Person> people;
    public Database(){
        this.people = new ArrayList<>();
    }

    @Override
    public void insert(Person person) {
        this.people.add(person);
    }

    @Override
    public void delete(Person person) {
        this.people.remove(person);
    }

    @Override
    public List<Person> getPeople() {
        return this.people;
    }
}
