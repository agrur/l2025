import java.util.Scanner;

class KeyWordThrowDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = scan.nextInt();
        checkAge(age);
    }

    private static void checkAge (int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - Тобі нема 18 років.");
        }
        else {
            System.out.println("Access granted ");
        }
    }
}
