

public class StackDemo1 {
    public static void main(String[] args) {
        int varX = 2;
        int varY = 42;
        printSum(varX, 3);
        System.out.println("All Done!");

    }

    private static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}