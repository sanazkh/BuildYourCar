package CarExtra;
import Enums.SeatNumber;
import Cars.Car;

public class WithSeatsNumber extends CarExtras {
    private Car car;
    public SeatNumber seatNo;

    public WithSeatsNumber(Car car, SeatNumber seatNo) {
        this.car = car;
        this.seatNo = seatNo;
    }

    @Override
    public void print() {
        super.print();
        System.out.print("The car has "+ seatNo +" seats \n");
    }
    @Override
    public double calcPrice() {
        double val = calcPriceForSeatNumber(seatNo);
        return  val + car.calcPrice();

    }


    public double calcPriceForSeatNumber( SeatNumber seatNumber ) {

        double price = 0.0;
        switch (seatNumber){
            case TWO:
                price =  10000.0;
                break;
            case FOUR:
                price =  20000.0;
                break;
            case SIX:
                price =   30000.0;
                break;
            default:
                price = 0.0;
                break;
        }
        return  price;
    }


}
