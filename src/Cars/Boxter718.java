package Cars;

import Cars.Car;

public class Boxter718 extends Car {

    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Boxter 718 is "+ transmisionType +"\n");
        System.out.print("This model is convertable \n");
    }
    @Override
    public double calcPrice() {
        double price = 57400.00;
        return price;
    }

}
