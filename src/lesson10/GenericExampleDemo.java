package lesson10;


import java.util.*;

public class GenericExampleDemo {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("22");
        stringList.add("333");

        //stringList.add(7);

        for (Object obj: stringList){
        if(obj instanceof String){
            String str = (String) obj;
            System.out.println(str);
            }
        }
        /*-
        for (String obj: stringList){
            System.out.println(obj);
        }
        */
    }
}
