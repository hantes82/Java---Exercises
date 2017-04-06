package pkg3;

/**
 * Created by itml on 25.03.2017.
 */
public class App {

    public static void main(String[] args) {

        WaterStore store = new MyWater();
        store.addLarge(5);
        store.addMedium(3);
        store.addSmall(3);
        store.addSmall(9);
        store.displayInfo();
    }
}
