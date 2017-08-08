package Cars;

import Cars.Car;

public class CayenneGTS extends Car {
    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Cayenne GTS is "+ transmisionType +"\n");
        System.out.print("This has plenty of seats \n");
    }

    @Override
    public double calcPrice() {
        double price = 98600.00;
        return price;
    }

}
