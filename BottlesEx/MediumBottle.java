package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public class MediumBottle extends AbstractBottle {

    private static double capacity = Bottle.MEDIUM;

    public MediumBottle() {
        super("MEDIUM");
    }

    @Override
    public void setCapacity(double c) {
        MediumBottle.capacity = c;
    }

    public double getCapacity() {
        return capacity;
    }



}
