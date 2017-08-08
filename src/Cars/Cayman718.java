package Cars;

import Cars.Car;

public class Cayman718 extends Car {
    String transmisionType = "Automatic";
    @Override
    public void print() {
        super.print();
        System.out.print("The transmision type for Cayman 718 is "+ transmisionType +"\n");
        System.out.print("This model has sunroof \n");
    }


    @Override
    public double calcPrice() {
        double price = 55300.00;
        return price;
    }



}
