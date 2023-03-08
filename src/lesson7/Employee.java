package lesson7;


import java.util.Date;

public  class Employee {
    private final String name;
    private final int age;
    private Date data;

    Employee(String name, int age, Date data) {
        this.name = name;
        this.age = age;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getData() {
        return (Date) data.clone();
    }
}
