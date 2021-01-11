package behavioralDesignPatterns.DataAccess;

import java.util.List;

public interface PersonDao {
    public void insert(Person person);
    public void delete(Person person);
    public List<Person> getPeople();
}
