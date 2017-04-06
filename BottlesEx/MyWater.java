package pkg3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by itml on 25.03.2017.
 */
public class MyWater implements WaterStore {

    private Map<EBottle, Integer> store = new HashMap<>();

    private void add(EBottle bottle, int count) {
        Integer bottleCount = store.get(bottle);
        if (bottleCount == null) {
            store.put(bottle, count);
        } else {
            store.put(bottle, bottleCount + count);
        }
    }

    @Override
    public void addLarge(int count) {
        this.add(EBottle.LARGE, count);
    }

    @Override
    public void addMedium(int count) {
        this.add(EBottle.MEDIUM, count);
    }

    @Override
    public void addSmall(int count) {
        this.add(EBottle.SMALL, count);
    }

    @Override
    public void displayInfo() {
        Iterator<Map.Entry<EBottle, Integer>> it = store.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<EBottle, Integer> entry = it.next();

            EBottle bottle = entry.getKey();
            Integer count = entry.getValue();

            double sum = bottle.getCapacity() * count;
            System.out.println(bottle.name() + " " + count + " of bottles, sum of litres: " + sum);
        }
    }
}
