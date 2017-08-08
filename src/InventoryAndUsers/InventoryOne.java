package InventoryAndUsers;

import Cars.Car;
import Cars.CarFactory;
import Enums.Model;

import java.util.*;
import java.util.function.Consumer;


public class InventoryOne implements Iterable, Observer {
    private static  int maxNumberOfItem = 100;
    private int _numberOfItems = 0;
    private  int quantity;
    private List<InventoryItem> listOfCarInInventory = new ArrayList<InventoryItem>();
    private Subject dealerOneCars;
    private Subject dealerTwoCars;
    CarFactory carFactory;

    public InventoryOne(Subject dealerOneCars, Subject dealerTwoCars, CarFactory carFactory) {


        Random rand = new Random();


        this.dealerOneCars = dealerOneCars;
        this.dealerTwoCars = dealerTwoCars;
        dealerOneCars.RegisterObserver(this);
        dealerTwoCars.RegisterObserver(this);
        this.carFactory = carFactory;
        for(Model model : Model.values()){
           Car car = buildCar(model);
           quantity = rand.nextInt(10) + 1;
           AddCar(new InventoryItem(car, quantity));

        }
    }
    private  Car buildCar(Model model){
        Car car;
        car = carFactory.makePorche(model);
        car.setModel(model);
        return  car;
    }

    // Iterator
    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }



    @Override
    public Iterator iterator()
    {
        return new InventoryIterator(listOfCarInInventory);
    }
    public void AddCar(InventoryItem carItem)
    {
        if (_numberOfItems >= maxNumberOfItem)
        {
            System.out.print("Sorry, menu is full!  Can't add item to menu");
        }
        else
        {
            listOfCarInInventory.add(carItem);
            _numberOfItems = _numberOfItems + 1;
        }
    }

//Observer Pattern

    @Override
    public void Update( Model model) {
        int quantity = 0;
        for(InventoryItem inventoryItem : listOfCarInInventory) {
            if (inventoryItem.getCar().getModel() == model) {
                inventoryItem.quantity = inventoryItem.quantity- 1;
                quantity = inventoryItem.quantity;
                break;
            }
        }
        int previousQ= quantity+1;
        System.out.print("-----------------------------------------  \n\t");
        System.out.print("\u001B[32m"+ model+ " quantity changes from " + previousQ + " To "+ quantity+ "\n");
    }
}

