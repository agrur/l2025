package lesson8;


class AmericanPerson extends Person {
    public AmericanPerson(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}