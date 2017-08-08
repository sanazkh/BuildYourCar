package InventoryAndUsers;

import Cars.Car;
import Enums.Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;


public class DealerTwo extends User implements Iterable, Subject {

    String name;
    String email;
    private static int maxNumberOfItem = 100;
    private int _numberOfItems = 0;
    private InventoryOne inventoryOne;
    private int quantity;

    private List<Observer> _observers = new ArrayList<Observer>();

    public DealerTwo() {
    }


    public double changePrice(double totalPrice) {
        return totalPrice - (totalPrice * 0.005);

    }

    public void print() {
        Iterator inventoryoneitrate = inventoryOne.iterator();
        System.out.print("This is the List Of Customizable Car in InventoryOne : \n ");
        printInventory(inventoryoneitrate);
    }

    private void printInventory(Iterator iterator) {
        while (iterator.hasNext()) {
            Car car = (Car) iterator.next();

            System.out.print(car.getModel() + "\n");

        }
    }
    // Iterator Pattern

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    // Observer Pattern
    @Override
    public void RegisterObserver(Observer observer) {
        _observers.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        _observers.remove(observer);
    }

    @Override
    public void NotifyObservers(Model model) {

        for (Observer observer : _observers) {
            observer.Update(model);

            System.out.print("\u001B[32mThe customer will get the car from dealer two.");
        }

    }

    public void quantityOfCarChanged(Model model) {
        NotifyObservers(model);
    }

    public void changeQuantity(Model model) {

        quantityOfCarChanged(model);
    }
}

