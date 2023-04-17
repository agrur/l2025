package lesson11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntegerTreeSetDemo {
    public static void main(String[] args)  {
        // Set demo with TreeSet
        Set<Integer> areaSet = new HashSet<>();
        areaSet.add(100);
        areaSet.add(50);
        areaSet.add(150);
        areaSet.add(70);
        areaSet.add(80);



        //print set contents
        System.out.print("Set contents:");
        System.out.println(areaSet);
    }
}
