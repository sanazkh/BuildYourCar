package Cars;

public class Carrera911S extends Car {
    String transmisionType = "Automatic";
    @Override
    public void print() {
        System.out.print("The transmision type for Carrera 911 S is "+ transmisionType +"\n");
        System.out.print("This is a sport car \n");
    }

    @Override
    public double calcPrice() {
        double price = 105100.00;
        return price;
    }

}
