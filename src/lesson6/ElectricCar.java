package lesson6;

import java.util.Objects;

public class ElectricCar extends Car{
    private int power;

    public ElectricCar(String model, String color, int volume) {
        super(model, color);
        this.power = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricCar)) return false;
        if (!super.equals(o)) return false;
        ElectricCar that = (ElectricCar) o;
        return super.equals(o) && power == that.power;
    }



    @Override
    public String toString() {
        return "ElectricCar{" + super.toString()+
                "power =" + power +
                '}';
    }
}
