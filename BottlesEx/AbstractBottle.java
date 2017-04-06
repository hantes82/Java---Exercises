package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public abstract class AbstractBottle implements Bottle {

    private String name;

    public AbstractBottle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String display() {
        return getName() + ", capacity: [" + getCapacity() + "]. ";
    }
}
