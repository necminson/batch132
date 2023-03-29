package day30mapsstaticblock;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    /*
        1)TreeMap puts entries in "natural order" by using "keys"
        2)TreeMaps spent too much time to put entries in "natural order", that is why they are so slow.
        3)TreeMaps are not "thread-safe" and "synchronized"
        4)TreeMaps accept "null" in "values" but does not accept in "keys"
     */

    public static void main(String[] args) {

        long t1 = System.nanoTime();

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("USA", 400000000);
        tm.put("Germany", 83000000);
        tm.put("Belgium", 12000000);
        tm.put("Albania", 3000000);
        tm.put("Turkey", 81000000);
        System.out.println(tm);// {Albania=3000000, Belgium=12000000, Germany=83000000, Turkey=81000000, USA=400000000}

        long t2 = System.nanoTime();

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Belgium", 12000000);
        hm.put("Albania", 3000000);
        hm.put("Turkey", 81000000);

        TreeMap<String, Integer> newTm = new TreeMap<>(hm);
        System.out.println(newTm);

        long t3 = System.nanoTime();

        System.out.println("Just TreeMap: " + (t2-t1));
        System.out.println("HashMap + TreeMap: " + (t3-t2));

    }

}