package lesson13;



public class StackTraceDemo {
    public static void main(String[] args) {
        m1();
        m2();
    }

    public static void m1() {

    }

    public static void m2() {
        m3();
        m4();
    }

    public static void m3() {

    }

    public static void m4() {
        m5();

    }

    public static void m5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }


    }
}
