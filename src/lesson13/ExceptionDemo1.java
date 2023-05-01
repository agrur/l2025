package lesson13;

import static lesson13.StackTraceDemo.m2;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        doSomething();
    }

    public static void doSomething() {
        int i = 1 / 0;

    }

}
