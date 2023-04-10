package lesson10;

import java.util.*;


public class ArrayListStudentsDemo {
    public static void main(String[] args) {
        //create ArrayList studentArrayList
        List<Student> studentArrayList = new ArrayList<>();
        //add elements to ArrayList
        Student s1 = new Student("Sofija", 95);
        Student s2 = new Student("Petro", 96);
        Student s3 = new Student("Ann", 92);
        Student s4 = new Student("Ann", 98);
        Student s5 = new Student("Ann", 98);
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);
        studentArrayList.add(s5);


        //print size()
        System.out.println("Number elements:" + studentArrayList.size());
       // /*-
        //print AllayList by get()
        for (int i = 0; i < studentArrayList.size(); i++){
            System.out.println(studentArrayList.get(i));
        }
       // */

        System.out.println("Print ArrayList by Iterator :");
       Iterator<Student> studentIterator = studentArrayList.iterator();
       while (studentIterator.hasNext()){
           System.out.println(studentIterator.next());

       }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Print ArrayList by For each");
        for (Student element : studentArrayList) {
            System.out.println(element + " ");
        }

        /*-
        //print ArrayList by foreach
        System.out.println("Print ArrayList by ForEach :");
        for (Student obj : studentArrayList)
            System.out.println(obj + " ");


        System.out.println();
        */
        ///*-
        //sort by compareTo
        System.out.println("Collections.sort() method");
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);
        // Collections.sort(studentArrayList, new StudentComparator());
       // */

    }

}
