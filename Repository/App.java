package pkg1;

/**
 * Created by kondz on 29.03.2017.
 */
public class App {
    public static void main(String[] args) {

        Repository cache = new Cache();

        Person p = new Person("Jan", "Kowalski", 36, cache);

        p.save();
    }

}
