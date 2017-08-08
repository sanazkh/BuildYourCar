package CarExtra;
import Cars.Car;

public class CarExtras extends Car {
    @Override
    public void print() {

    }

    @Override
    public double calcPrice() {
        return getPrice();
    }
}
