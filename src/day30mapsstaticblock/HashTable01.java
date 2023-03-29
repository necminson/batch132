package day30mapsstaticblock;

import java.util.Hashtable;

public class HashTable01 {

    /*
        1)HashTable is "thread-safe" and "synchronized"
        2)HashTables put the entries in random order like HashMaps
        3)HashTables do not accept "null" in key and value parts
        4)HashTables are slower than HashMaps
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put("USA", 400000000);
        ht.put("Germany", 83000000);
        ht.put("Belgium", 12000000);
        ht.put("Albania", 3000000);
        ht.put("Turkey", 81000000);
        //ht.put(null, 300); ==> "null" cannot be used in key of HashTable
        //ht.put("Italy", null); ==> "null" cannot be used in value of HashTable

        System.out.println(ht);// {USA=400000000, Albania=3000000, Germany=83000000, Turkey=81000000, Belgium=12000000}
    }
}