package pkg;

/**
 * Created by kondz on 25.03.2017.
 */
public abstract class SkiEquipment extends SnowEquipment implements Bindings {

    private boolean isPolished = false;
    private int surfaceState = 0;

    public void polish() {
        isPolished = true;
    }

    public void regenerate () {
        surfaceState = 100;
    }

    public int getSurfaceState() {
        return surfaceState;
    }

    public boolean isPolished() {
        return isPolished;
    }
}
