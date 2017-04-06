package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public class LargeBottle extends AbstractBottle {

    private static double capacity = Bottle.LARGE;

    public LargeBottle() {
        super("LARGE");
    }

    @Override
    public void setCapacity(double c) {
        LargeBottle.capacity = c;
    }

    public double getCapacity() {
        return capacity;
    }
}
