package lesson7;

import java.util.Scanner;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arr = Arrays.stream(scan.nextLine().trim().split("\\s"))
                .filter(x -> !x.equals(""))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double each : arr) {
            System.out.print(each + "  ");
        }
    }
}
