package lesson9;

public class AltCar {
    private final String color;
    public  static int numberOfCars;

    public AltCar(String color) {
        this.color = color;
        numberOfCars++;
    }

    public static void main(String[] args) {
        AltCar myCar1 = new AltCar("blue");
        AltCar myCar2 = myCar1;
        AltCar myCar3 = new AltCar("blue");
        System.out.println("myCar1 == myCar2 :" + (myCar1 == myCar2));
        System.out.println("myCar1 == myCar3 :" + (myCar1 == myCar3));
        System.out.println("__________hash codes of objects________________");
        System.out.println("hash code myCar1 :" + myCar1.hashCode());
        System.out.println("hash code myCar2 :" + myCar2.hashCode());
        System.out.println("hash code myCar3 :" + myCar3.hashCode());
        System.out.println(numberOfCars);
    }
}
