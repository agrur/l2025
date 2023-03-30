package lesson9;

public class Hashes {
    public static void main(String[] args) {
        //declare two objects
        Password p1 = new Password ("ABC");
        Password p2 = new Password ("abc");
        //compare and print
        System.out.println("Hash for password 1");
        System.out.println(p1.hashCode());
        System.out.println("Hash for password 2");
        System.out.println(p2.hashCode());
        System.out.println("Equals ? " + p1.equals(p2));
    }
}
