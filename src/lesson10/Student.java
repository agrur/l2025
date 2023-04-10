package lesson10;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int rate;

    public Student() {
    }

    public Student(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        int result = this.name.compareTo(anotherStudent.name);
        ///*-
        if (result == 0){
            result = Integer.compare(-this.getRate(), -anotherStudent.getRate());
        }
        //*/

        return result;
    }

   /* public static Comparator<Student> NameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
    public Comparator<Student> rateComparator = new Comparator<Student>() {
        @Override
        public int compare(Student e1, Student e2) {
            return e1.getRate().compareTo(e2.rate));
        }
    };*/


}

