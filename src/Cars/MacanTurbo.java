package Cars;

import Cars.Car;

public class MacanTurbo extends Car {
    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Megan Turbo is "+ transmisionType +"\n");
        System.out.print("This model is Turbo \n");
    }

    @Override
    public double calcPrice() {
        double price = 77200.00;
        return price;
    }


}
