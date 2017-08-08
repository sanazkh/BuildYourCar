package CarExtra;
import  Enums.Color;

import Cars.Car;
public class WithColor extends CarExtras {
    private Car car;
    public Color color;

    public WithColor(Car car, Color color) {
        this.car = car;
        this.color = color;
    }

    @Override
    public double calcPrice() {
        double val = calcPriceForColor(color);
        return  val + car.calcPrice();
    }



    public double calcPriceForColor(Color color) {

        double price = 0.0;
        switch (color){
            case RED:
                price =  5000.0;
                break;
            case YELLOW:
                price =  20000.0;
                break;
            case BLACK:
                price =   30000.0;
                break;
            case WHITE:
                price =   30000.0;
                break;
            default:
                price = 0.0;
                break;
        }
        return  price;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("The car color "+ color +"\n");
    }
}
