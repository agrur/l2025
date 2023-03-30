package lesson9;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); //calling change method
        //creating objects
        Student s1 = new Student("Anna");
        s1.display();
        Student s2 = new Student("Petro");
        s2.display();
        Student s3 = new Student("Sonja");
        s3.display();
    }
}
