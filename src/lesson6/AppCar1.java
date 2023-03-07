package lesson6;
 class AppCar1 {
    public static void main(String[] args) {
        Car car1 = new Car("bmw", "blue");
        Car car2 = new Car("bmw", "blue");;
        Car car3 = new Car("Volvo", "green");
        Car car4 = new ElectricCar("Tesla", "black", 2200);
        Car car5 = new ElectricCar("Tesla", "white", 2200);
        System.out.println(car5 instanceof Car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println("Check equals  : " + car1.equals(car4));
        System.out.println("Check equals  :  " + car4.equals(car5));
        System.out.println("Check hashcode car1 :" + car1.hashCode());
        System.out.println("Check hashcode car2 :" + car2.hashCode());
    }
}