package CarExtra;
import Enums.SeatColor;
import Cars.Car;

public class WithSeatsColor extends CarExtras {
    private Car car;
    public SeatColor seatColor;

    public WithSeatsColor(Car car, SeatColor seatColor) {
        this.car = car;
        this.seatColor = seatColor;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("The seat color of the car is "+ seatColor +"\n");
    }
    @Override
    public double calcPrice() {
        double val = calcPriceForSeatColor(seatColor);
        return  val + car.calcPrice();
    }



    public double calcPriceForSeatColor( SeatColor seatColor ) {

        double price = 0.0;
        switch (seatColor){
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
}
