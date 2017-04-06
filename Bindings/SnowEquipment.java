package pkg;

/**
 * Created by kondz on 25.03.2017.
 */
public abstract class SnowEquipment {

    protected int sharpenState = 100;
    public void sharp() {
        this.sharpenState = 100;
    };

    public int getSharpenState() {
        return sharpenState;
    }
}
