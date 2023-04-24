package lesson12;

import java.util.*;

public class CountriesMapDemo {
    public static void main(String[] args) {
        // define hashmap<> collection
        Map<Integer, String> countriesMap = new TreeMap<>();
        countriesMap.put(1, "USA");
        countriesMap.put(39, "Italy");
        countriesMap.put(380, "Ukraine");
        countriesMap.put(49, "Germany");
        countriesMap.put(31, "Netherlands");

        System.out.println(countriesMap);

        // get(k)
        System.out.println("++++ get(k) ++++++++");
        String k1 = countriesMap.get(380);
        System.out.println(k1);
        ///*-
        // get set of the keys
        System.out.println("++++ keySet() of keys ++++++++");
        Set<Integer> keys = countriesMap.keySet();
        System.out.println(keys);
        ///*
        ///*-
        // get set of the values
        System.out.println("++++ get set of value ++++++++");
        Collection<String> values = countriesMap.values();
        System.out.println(values);
        //*/
        ///*-
        // remove(k)
        countriesMap.remove(39);
        //*/
         ///*-
        // entrySet() method
        System.out.println("++++ entrySet() method ++++++++");
        for (Map.Entry<Integer, String> item : countriesMap.entrySet()) {

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
        }
        //*/
        System.out.println(countriesMap.get(1).hashCode());

    }


}
