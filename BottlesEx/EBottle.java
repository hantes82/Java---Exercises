package pkg3;

/**
 * Created by itml on 26.03.2017.
 */
public enum EBottle {

    CAN(0.25), SMALL(0.5), MEDIUM(1), LARGE(2);

    EBottle(double capacity) {
        this.capacity = capacity;
    }
    private double capacity;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
