package lesson6;

public class AppStudentDemo {
    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo("ABC", 101);
        StudentDemo s2 = new StudentDemo("DEF", 102);
        StudentDemo s3 = new StudentDemo("ABC", 101);
        System.out.println(s3.equals(s1));
        System.out.println(s1);
        System.out.println(s2);
    }
}
