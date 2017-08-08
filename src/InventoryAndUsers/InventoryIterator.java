package InventoryAndUsers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class InventoryIterator implements Iterator {

    private List<InventoryItem> listOfCarInInventory;
    private int position = 0;


    public InventoryIterator(List<InventoryItem> listOfCarInInventory) {
        this.listOfCarInInventory = listOfCarInInventory;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public boolean hasNext() {
        if (position >= listOfCarInInventory.size() || listOfCarInInventory.get(position) == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public Object next() {
        InventoryItem car = listOfCarInInventory.get(position);
        position = position + 1;
        return car;
    }
}
