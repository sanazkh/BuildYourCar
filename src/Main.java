
        import CarExtra.WithColor;
        import CarExtra.WithSeatsColor;
        import CarExtra.WithSeatsNumber;
        import CarExtra.WithWheels;
        import Cars.Car;
        import Cars.CarFactory;
        import Enums.*;
        import InventoryAndUsers.InventoryOne;
        import InventoryAndUsers.Customer;
        import InventoryAndUsers.DealerOne;
        import InventoryAndUsers.DealerTwo;
        import InventoryAndUsers.ProxyCustomer;

        import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        CarFactory carFactory = new CarFactory();
        Car car = null;
        double totalPrice = 0.0;
        String colorType = "";
        String seatColor = "";
        String wheelType = "";
        String seatNumber = "";
        String yesnoAnswer = "";
        String dyesnoAnswer = "";
        Model model = null;
        String typeOfPorche = "";
        String yesNoTest;
        String forwardRes;


        Scanner userInput = new Scanner(System.in);
        Scanner userInput1 = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        String dealerSelect = "";

        Main mainacess = new Main();


        // GET Inventory Data-

        DealerOne dealerOne = new DealerOne();
        DealerTwo dealerTwo = new DealerTwo();

        InventoryOne inventoryOne = new InventoryOne(dealerOne, dealerTwo, carFactory);




        ProxyCustomer pcustomer = new ProxyCustomer();

        // Create Customer
        Customer customer = new Customer(inventoryOne);
        System.out.print("-----------------------------------------  \n\t");
        customer.print();

        System.out.print("\033[1m-----------------------------------------  \n\t");

       // System.out.print("What type of Porche from this inventory do you to want customize?  \n\t");
        boolean good = false;

       do{
           System.out.print("What type of Porche from this inventory do you to want customize?  \n\t");
           typeOfPorche = userInput.nextLine();
           if(typeOfPorche.equalsIgnoreCase("Cayman718") || typeOfPorche.equalsIgnoreCase("Boxter718") ||
                   typeOfPorche.equalsIgnoreCase("Carrera911") || typeOfPorche.equalsIgnoreCase("Carrera911S")
                   || typeOfPorche.equalsIgnoreCase("CayenneGTS") || typeOfPorche.equalsIgnoreCase("CayenneTurbo")
                   || typeOfPorche.equalsIgnoreCase("MacanGTS") || typeOfPorche.equalsIgnoreCase("MacanTurbo") ||
                   typeOfPorche.equalsIgnoreCase("Panamera4") || typeOfPorche.equalsIgnoreCase("Panamera4Hybrid")){
               model = Model.valueOf(typeOfPorche);
               car = carFactory.makePorche(model);
               good = true;
           }
           else{
               System.out.println("Incorrect value. Please try again.");
           }


       }while (!good);

       boolean colorTrue = false;
        System.out.print("-----------------------------------------  \n\t");
       do{
           System.out.print("What color? (RED, YELLOW, BLACK, WHITE) \n\t");
           colorType = userInput1.nextLine();
           if(colorType.equalsIgnoreCase("Red") || colorType.equalsIgnoreCase("Yellow")
                   || colorType.equalsIgnoreCase("black")|| colorType.equalsIgnoreCase("white")){
               Color color = Color.valueOf(colorType.toUpperCase());
               //AddColor by Decorator Pattern
               car = new WithColor(car, color);
               car.print();
               totalPrice = totalPrice + car.calcPrice();
               colorTrue = true;
           }
           else{
               System.out.println("Incorrect value. Please try again.");
           }
       }while (!colorTrue);


        boolean scolorTrue = false;
        System.out.print("-----------------------------------------  \n\t");
        do{
            System.out.print("What color for your seat? (RED, YELLOW, BLACK, WHITE) \n\t");
            seatColor = userInput1.nextLine();
            if(seatColor.equalsIgnoreCase("Red") || seatColor.equalsIgnoreCase("Yellow")
                    || seatColor.equalsIgnoreCase("black")|| seatColor.equalsIgnoreCase("white")){
                SeatColor scolor = SeatColor.valueOf(seatColor.toUpperCase());
                //Add seat color by decorator pattern
                car = new WithSeatsColor(car, scolor);
                car.print();
                totalPrice = totalPrice + car.calcPrice();
                scolorTrue = true;
            }
            else{
                System.out.println("Incorrect value. Please try again.");
            }
        }while (!scolorTrue);


        boolean sNumber = false;
        System.out.print("-----------------------------------------  \n\t");

        do{
            System.out.print("How many seats? (Two, Four, Six) \n\t");
            seatNumber = userInput1.nextLine();
            if(seatNumber.equalsIgnoreCase("Two") || seatNumber.equalsIgnoreCase("Four")
                    || seatNumber.equalsIgnoreCase("Six")){
                SeatNumber seatNumber1 = SeatNumber.valueOf(seatNumber.toUpperCase());
                //Add seat Number by decorator pattern
                car = new WithSeatsNumber(car, seatNumber1);
                car.print();
                totalPrice = totalPrice + car.calcPrice();
                sNumber = true;
            }
            else{
                System.out.println("Incorrect value. Please try again.");
            }
        }while (!sNumber);


        boolean wTrue = false;
        System.out.print("-----------------------------------------  \n\t");
        do{
            System.out.print("What types of wheel? (BOXSTER, CAYMAN, CARRERA) \n\t");
            wheelType = userInput1.nextLine();
            if(wheelType.equalsIgnoreCase("BOXSTER") || wheelType.equalsIgnoreCase("CAYMAN")
                    || wheelType.equalsIgnoreCase("CARRERA")){
                Wheel wheel1 = Wheel.valueOf(wheelType.toUpperCase());
                //Add wheal by decorator pattern
                car = new WithWheels(car, wheel1);
                car.print();
                totalPrice = totalPrice + car.calcPrice();
                wTrue = true;
            }
            else{
                System.out.println("Incorrect value. Please try again.");
            }
        }while (!wTrue);

        System.out.print("-----------------------------------------  \n\t");
        System.out.print("\u001B[36m The car you have customized has these details: " + typeOfPorche + ", its color is: " + colorType + ", its seats color: " + seatColor+",\n"
                +"the seats number: " + seatNumber+ ", its wheel type:" +wheelType+ "\u001B[36m \n");
        System.out.print("\033[1m-----------------------------------------  \n\t");
        System.out.print("The total price for "+ typeOfPorche +" is " + totalPrice + "\n");


        boolean yesNoTrue = false;
        System.out.print("-----------------------------------------  \n\t");
        do{
            System.out.print("Do you like this price and choose a dealer for special discounts? \n\t");
            yesnoAnswer = userInput1.nextLine();
            if(yesnoAnswer.equalsIgnoreCase("yes") || yesnoAnswer.equalsIgnoreCase("no")){
                yesNoTrue = true;
            }
            else{
                System.out.println("Incorrect value. Please try again.");
            }
        }while (!yesNoTrue);


        boolean dealerYesNo = false;

        if(yesnoAnswer.equalsIgnoreCase("yes")) {

            System.out.print("-----------------------------------------  \n\t");
            do {
                System.out.print("Choose a dealer: (Dealer one, Dealer two) \n\t");
                dealerSelect = userInput1.nextLine();
                if (dealerSelect.equalsIgnoreCase("one") || dealerSelect.equalsIgnoreCase("two")) {

                    dealerYesNo = true;
                } else {
                    System.out.println("Incorrect value. Please try again.");
                }
            } while (!dealerYesNo);


            if(dealerSelect.equalsIgnoreCase("one")){
                DealerOne done = new DealerOne();
                totalPrice = done.changePrice(totalPrice);
                System.out.print("The total price after discount is: " + totalPrice +"\n\t" );

            } else if(dealerSelect.equalsIgnoreCase("two")){
                DealerTwo dtwo = new DealerTwo();
                totalPrice = dtwo.changePrice(totalPrice);
                System.out.print("The total price after discount is: " + totalPrice +"\n\t" );
            }

            boolean testYes = false;


            boolean ppyesno = false;
            String checkYesNo;
            System.out.print("-----------------------------------------  \n\t");
            do{
                System.out.print("Do you like to check-out the car? \n\t");
                checkYesNo = userInput1.nextLine();
                if(checkYesNo.equalsIgnoreCase("yes") || checkYesNo.equalsIgnoreCase("no")){
                    ppyesno = true;
                }
                else{
                    System.out.println("Incorrect value. Please try again.");
                }
            }while (!ppyesno);

            if(checkYesNo.equalsIgnoreCase("yes")){
                boolean ayesno = false;
                String webCheckyesno;
                System.out.print("-----------------------------------------  \n\t");
                do{
                    System.out.print("Would you like to authenticate directly through this website? \n\t");
                    webCheckyesno = userInput1.nextLine();
                    if(webCheckyesno.equalsIgnoreCase("yes") || webCheckyesno.equalsIgnoreCase("no")){
                        ayesno = true;
                    }
                    else{
                        System.out.println("Incorrect value. Please try again.");
                    }
                }while (!ayesno);

                if(webCheckyesno.equalsIgnoreCase("yes")){

                    System.out.print("\033[1mEnter your Email  to Login  \n\t");
                    if (userInput.hasNextLine()) {

                        String email = userInput.nextLine();
                        customer.setEmail(email);
                        System.out.print("Enter your Password to Login  \n\t");
                        String pass = userInput.nextLine();
                        customer.setPass(pass);
                        customer.setUserPass(email,pass);


                    }

                }else if(webCheckyesno.equalsIgnoreCase("no")){
                    System.out.print("\033[1mEnter the name of a service for authentification  \n\t");
                    if (userInput.hasNextLine()) {
                        String serviceName = userInput.nextLine();
                        System.out.print("\033[1mEnter your Email to Login through a service \n\t");
                        String serviceEmail = userInput.nextLine();
                        pcustomer.setEmail(serviceEmail);
                        System.out.print("Enter your Password to Login through a service  \n\t");
                        String servicePass = userInput.nextLine();
                        pcustomer.setPass(servicePass);
                        pcustomer.setUserPass(serviceEmail,servicePass);

                    }
                }

                System.out.print("Processing the payment information .............. \n\t" + "The total price is: " + totalPrice + " you can pick up soon \n");
                if (dealerSelect.equalsIgnoreCase("one")) {
                    dealerOne.changeQuantity(model);
                } else {
                    dealerTwo.changeQuantity(model);
                }

            } else if(checkYesNo.equalsIgnoreCase("no")){
                System.out.print("-----------------------------------------  \n\t");
                System.out.print("Thanks for visiting our website.");
                System.exit(0);
            }


        } else{
            System.out.print("-----------------------------------------  \n\t");
            System.out.print("Thanks for visiting our website.");
            System.exit(0);
        }


    }
}


