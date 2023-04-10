package lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a list of names
        List<String> names = new ArrayList<>();

        names.add("Welcome");
        names.add("To");
        names.add("Kyiv");


        // Getting ListIterator
        ListIterator<String> listIterator
                = names.listIterator();

        // Traversing elements using next() method
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        // for-each loop creates Internal Iterator here.
        for (String s : names) {
            System.out.println(s);
        }
        Collections.sort(names);
        System.out.println(names);
    }
}
