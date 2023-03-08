package lesson7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImmutableObjectDemo {
    public static void main(String[] args) {
        Employee st1 = new Employee("Mike", 22, new Date());

        String s = st1.getName();
        int i = st1.getAge();
        Date d = st1.getData();

     /*   s = "Jane";
        i = 21;
        d.setTime();*/

        System.out.println(st1.getName());
        System.out.println(st1.getAge());
        System.out.println(st1.getData());

    }

}
