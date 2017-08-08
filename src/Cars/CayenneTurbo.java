package Cars;

import Cars.Car;

public class CayenneTurbo extends Car {
    String transmisionType = "Automatic";

    @Override
    public void print() {
        System.out.print("The transmision type for Cayenne Turbo is "+ transmisionType +"\n");
        System.out.print("This has plenty of seats \n");
    }

    @Override
    public double calcPrice() {
        double price = 118100.00;
        return price;
    }
}
