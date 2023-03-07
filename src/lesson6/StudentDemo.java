package lesson6;

import java.util.Objects;

class StudentDemo {
     private String name;
     private int regNo;

     public StudentDemo(String name, int regNo) {
         this.name = name;
         this.regNo = regNo;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDemo)) return false;
        StudentDemo that = (StudentDemo) o;
        return regNo == that.regNo && name.equals(that.name);
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(name, regNo);
    }*/

    @Override
     public String toString() {
         return "StudentDemo{" +
                 "name='" + name + '\'' +
                 ", regNo=" + regNo +
                 '}';
     }

 }
