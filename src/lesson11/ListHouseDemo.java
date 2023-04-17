package lesson11;

import java.util.*;

public class ListHouseDemo {
    public static void main(String[] args) {

        List<House> houseList = new ArrayList<>();

        House h1 = new House(100, 120000, "Kyiv", true);
        House h2 = new House(90, 120000, "Kyiv", true);
        House h3 = new House(150, 100000, "Lviv", true);
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
        /*-
        Collections.sort(houseList);
        */

        /*-
        System.out.println("Sorted by price: ");
        PriceComparator priceComparator = new PriceComparator();
        houseList.sort(priceComparator);
        */
        /*-
         System.out.println("Sorted by area: ");
        AreaComparator areaComparator = new AreaComparator();
        houseList.sort(areaComparator);
        */
        /*-
        System.out.println("Complicated sorted");
        PriceComparator priceComparator = new PriceComparator();
        AreaComparator areaComparator = new AreaComparator();
        houseList.sort(priceComparator.thenComparing(areaComparator));

        */
        System.out.println("======SORTED============");

        for (House h : houseList) {
            System.out.println(h);
        }
    }
}
