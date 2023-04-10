package lesson10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class RandomAccessDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            list1.add("" + i);
            list2.add("" + i);
        }
        long t0 = System.nanoTime();
        for (int i = 0, n = list1.size(); i < n; i++) {
            String s = list1.get(i);
        }
        long t1 = System.nanoTime();
        for (int i = 0, n = list2.size(); i < n; i++) {
            String s = list2.get(i);
        }
        long t2 = System.nanoTime();
        System.out.println("  " + (list1 instanceof RandomAccess) + " " +(list2 instanceof RandomAccess));
        System.out.println( (t1 - t0) + " " + (t2 - t1));

    }
}