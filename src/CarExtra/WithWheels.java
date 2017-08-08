package CarExtra;
import Cars.Car;
import Enums.Wheel;
public class WithWheels extends CarExtras {

    private Car car;
    public Wheel wheel;

    public WithWheels(Car car, Wheel wheel) {
        this.car = car;
        this.wheel = wheel;
    }


    @Override
    public void print() {
        super.print();
        System.out.print("The car wheel type is "+ wheel +"\n");
    }
    @Override
    public double calcPrice() {
        double val = calcPriceForWheelType(wheel);
        return  val + car.calcPrice();
    }



    public double calcPriceForWheelType( Wheel wheel ) {

        double price = 0.0;
        switch (wheel){
            case BOXSTER:
                price =  5000.0;
                break;
            case CARRERA:
                price =  20000.0;
                break;
            case CAYMAN:
                price =   30000.0;
                break;
            default:
                price = 0.0;
                break;
        }
        return  price;
    }

}
