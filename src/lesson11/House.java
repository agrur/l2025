package lesson11;


public class House implements Comparable<House> {
    int area;
    int price;
    String city;
    boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    public int getArea() {
        return area;
    }

    public int getPrice() {
        return price;
    }

    public String getCity() {
        return city;
    }

    public boolean isHasFurniture() {
        return hasFurniture;
    }

    @Override
    public String toString() {
        String sb = "House{" + "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
        return sb;
    }
///*-
    @Override
    public int compareTo(House anotherHouse) {
        int result = Integer.compare(-this.area, -anotherHouse.area);
        return result;
    }
//*/

}

