package lesson8;

public class AbstractPersonDemo {
    public static void main(String[] args) {
        Person ivan = new UkrainianPerson("Іван");
        Person jhon = new AmericanPerson("Jhon");
        ivan.greet(jhon);
        jhon.greet(ivan);

    }
}














