package lesson11;

import java.util.*;


public class StringTreeSetDemo {
    public static void main(String[] args)  {
        // Set demo with TreeSet
        Set<String> citySet = new HashSet<>();
        citySet.add("Kyiv");
        citySet.add("Paris");
        citySet.add("Amsterdam");
        citySet.add("Warsaw");
        citySet.add("Budapest");

        //print set contents
        System.out.print("Set contents:");
        System.out.println(citySet);
    }
}
