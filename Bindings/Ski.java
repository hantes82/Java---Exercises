package pkg;

/**
 * Created by kondz on 25.03.2017.
 */
public class Ski extends SkiEquipment {

    private SnowBindings snowBindings = null;
    @Override
    public void mount() {
        snowBindings = new SkiBindings();
    }

    @Override
    public void unmount() {
        snowBindings = null;
    }

    @Override
    public void setBind(double shoeSize) {
        snowBindings.setShoeSize(shoeSize);
    }
}
