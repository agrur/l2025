package lesson8;

class UkrainianPerson extends Person {
    public UkrainianPerson(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Вітаю!");
    }
}