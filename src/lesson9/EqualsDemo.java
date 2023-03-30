package lesson9;

import java.util.Date;

public class EqualsDemo {
    public static void main(String[] args) {
        //creating constructor of the Double class
        Double x = 123.45555;
        //creating constructor of the Long class
        Double y = 9887544.5;
        //invoking the equals() method
        System.out.println("Objects x, y are not equal :" + x.equals(y));
        System.out.println("Objects x, 123.45555 are not equal :" + x.equals(123.45555));
        System.out.println("Objects test identity :" + (x == y));
        Date a = new Date(123);
        Date b = new Date(123);
        System.out.println("Objects a, b test identity :" + (a == b)); //false
        System.out.println("Objects a, b are equal :" + a.equals(b));//true
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
