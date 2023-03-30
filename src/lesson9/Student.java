package lesson9;

public class Student {
    static int number;
    String name;
    static String faculty = "ITS";
    //constructor to initialize the variable

    public Student(String name) {
        this.name = name;
        number++;
    }

    //static method to change the value of static variable
    static void change() {
        faculty = "RF";
    }

    //method to display values
    void display() {
        System.out.println(number + " " + name + " " + faculty);
    }
}
