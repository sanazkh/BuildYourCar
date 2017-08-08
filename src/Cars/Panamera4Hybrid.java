package Cars;

import Cars.Car;

public class Panamera4Hybrid extends Car {

    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Panamera 4 Hybrid is "+ transmisionType +"\n");
        System.out.print("This model is hybrid \n");
    }


    @Override
    public double calcPrice() {
        double price = 99600.00;
        return price;
    }

}
