package pkg1;

/**
 * Created by kondz on 29.03.2017.
 */
public class Database implements Repository {
    @Override
    public void save(Person person) {
        System.out.println("Storing to database: "+person);
    }
}
