package lesson4;

import java.util.Arrays;

public class ArrayIntDemo1 {
    public static void main(String[] args) {
//        int[] myArray = {7, 4, 3, 2, 7, 8, 13};
        int[] myArray = new int[7];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = (int) (Math.random()*10);
        }
        // 1 спосіб FOR
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i]+ " ");

        System.out.println();
        // 2 спосіб FOREACH
        for ( int k: myArray) {
            System.out.print(k + " ");
        }
        System.out.println();
        // 3 спосіб Arrays
        System.out.println(Arrays.toString(myArray));
    }
}
