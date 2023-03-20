package lesson8;

abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    abstract public void sayHello();

    public void doHandshake(Person p) {
        // do handshake with p
        System.out.println("_____" + name + " give hand to " + p.name + "_____");
    }

    public void greet(Person p) {
        doHandshake(p);
        sayHello();
    }
}