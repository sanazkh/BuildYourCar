package Cars;

import Cars.Car;

public class MacanGTS extends Car {
    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Megan GTS is "+ transmisionType +"\n");
        System.out.print("This model is SUV \n");
    }


    @Override
    public double calcPrice() {
        double price = 68900.00;
        return price;
    }

}
