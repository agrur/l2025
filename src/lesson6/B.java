package lesson6;

class B extends A {
    public void m1() {
        System.out.println("B_m1");

    }

    public void m2() {
        System.out.println("B_m2");
        m1();
    }
}