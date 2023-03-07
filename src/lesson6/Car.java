package lesson6;
import java.util.Objects;

 class Car {
    private String model;
    private String color;

    public Car() {

    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color);
    }
}