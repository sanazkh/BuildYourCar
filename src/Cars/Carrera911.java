package Cars;

public class Carrera911 extends Car {

    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Carrera 911 is "+ transmisionType +"\n");
    }


    @Override
    public double calcPrice() {
        double price = 91100.00;
        return price;
    }

}
