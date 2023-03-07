import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int x, y, z;
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input x, y");
            x = scan.nextInt();
            y = scan.nextInt();
            z = x / y;
            System.out.println(z);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("There is arithmeticException");
        }
    }
}

