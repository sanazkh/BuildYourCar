package Cars;

import Cars.Car;

public class Panamera4 extends Car {

    String transmisionType = "Automatic";

    @Override
    public void print() {
        System.out.print("The transmision type for Panamera 4 is "+ transmisionType +"\n");
        System.out.print("This model has baby car seat \n");
    }

    @Override
    public double calcPrice() {
        double price = 89600.00;
        return price;
    }

}
