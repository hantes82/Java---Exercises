package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public interface Bottle {

    double SMALL = 0.5;
    double MEDIUM = 1;
    double LARGE = 2;

    void setCapacity(double capacity);

    double getCapacity();

    String display();
}
