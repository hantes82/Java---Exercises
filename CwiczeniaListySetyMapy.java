package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> mapa = new HashMap<String,String>();

        mapa.put("JAnek","John");
        mapa.put("Grzegorz","George");
        mapa.remove("Grzegorz");
        System.out.println(mapa.get("Grzegorz"));
        mapa.put("Grzegorz","George");
        mapa.put("Grzegorz","George");

        Iterator<Map.Entry<String,String>> iterator = mapa.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<String,String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }

        ArrayList <Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista. add(3);
        lista.add(5);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);

        System.out.println(lista);
        System.out.println(lista.indexOf(5));

        Iterator <Integer> iterator2 = lista.iterator();

        while (iterator2.hasNext()) {
            Integer element = iterator2.next();
            System.out.println(element);
        }

    Set <String> nowySet = new HashSet<String>();

        nowySet.add("Ala");
        nowySet.add("ma");
        nowySet.add("kota");
        System.out.println(nowySet);
        nowySet.remove("Ala");
        System.out.println(nowySet);
        System.out.println(nowySet);

        Iterator <String> iteratorSet = nowySet.iterator();
        while (iteratorSet.hasNext()) {
            String element = iteratorSet.next();
            System.out.println(element);
        }
        for (String ss : nowySet) {
            System.out.println(ss);
        }
    Map<Integer, String> nowaMapa = new HashMap<Integer,String>();

        Iterator<Map.Entry<Integer,String>> iteratorMapy = nowaMapa.entrySet().iterator();

                while(iteratorMapy.hasNext()) {
                Map.Entry <Integer,String> elem1 = iteratorMapy.next();
                int keyMap = elem1.getKey();
                String valueMap = elem1.getValue();
                    System.out.println(keyMap+" "+valueMap);

                }
        nowaMapa.put (2, "Piotrek");
        nowaMapa.put (4, "John");

        // nowaMapa.remove(2);
        //   nowaMapa.remove("P", "Piotrek");
        String j = nowaMapa.get(4);

        System.out.println(j);


    }
}
