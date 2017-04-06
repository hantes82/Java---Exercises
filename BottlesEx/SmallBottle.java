package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public class SmallBottle extends AbstractBottle {

    private static double capacity = Bottle.SMALL;

    public SmallBottle() {
        super("SMALL");
    }

    @Override
    public void setCapacity(double c) {
        SmallBottle.capacity = c;
    }

    public double getCapacity() {
        return capacity;
    }
}
