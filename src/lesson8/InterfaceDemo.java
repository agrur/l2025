package lesson8;

interface Speakable {
    void speak(); // implicitly public abstract
}
class Human implements Speakable{
    public void speak() { // must be public
        System.out.println("Hello! How are you");
    }
}
class Cat implements Speakable{
    public void speak() { // must be public
        System.out.println("Meow");
    }
}
class InterfaceDemo {
    public static void main(String[] args) {
        Speakable[] creatures = {new Human(), new Cat(), new Human()};
        for (Speakable s: creatures) {
            s.speak();
        }

    }

}
