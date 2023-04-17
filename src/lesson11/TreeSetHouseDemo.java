package lesson11;


import java.util.Set;

import java.util.TreeSet;

public class TreeSetHouseDemo {
    public static void main(String[] args) {
        Set<House> houseList = new TreeSet<>();

        House h1 = new House(100, 120000, "Kyiv", true);
        House h2 = new House(90, 120000, "Kyiv", true);
        House h3 = new House(150, 150000, "Lviv", true);
        House h4 = new House(70, 70000, "Rivne", false);
        House h5 = new House(80, 90000, "Rivne", true);

        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);
        houseList.add(h4);
        houseList.add(h5);
        for (House h : houseList) {
            System.out.println(h);
        }
    }
}
