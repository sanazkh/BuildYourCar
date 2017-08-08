package InventoryAndUsers;

import Cars.Car;

public class InventoryItem {
    public Car car;
    public int quantity;
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public InventoryItem(){}

    public InventoryItem(Car car, int quantity) {
        this.car = car;
        this.quantity = quantity;
    }
}
