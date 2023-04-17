package lesson11;

import java.util.Comparator;

public class AreaComparator implements Comparator<House> {

    @Override
    public int compare(House h1, House h2) {
        if(h1.getArea() == h2.getArea()){
            return 0;
        }
        if(h1.getArea() > h2.getArea()){
            return -1;
        } else {
            return 1;
        }
    }
}
