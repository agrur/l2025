public class BreakContinueDemo {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
