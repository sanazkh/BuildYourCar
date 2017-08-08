package InventoryAndUsers;

import java.util.Iterator;
public class Customer extends User {
    public Customer() {
    }

    String pass;
    String email;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Customer(String pass, String email) {

        setEmail(email);
        setPass(pass);

    }

    private InventoryOne inventoryOne;

    public Customer(String name, String email, InventoryOne inventoryOne) {

        this.inventoryOne = inventoryOne;
        setEmail(email);
        setPass(pass);
      //  System.out.print("Customer with email " + email + " is logged-in \n");
    }
    public Customer( InventoryOne inventoryOne) {

        this.inventoryOne = inventoryOne;
      //  System.out.print("Customer with " + email + " is logged-in \n");

    }
    // Using Iterator patern to Iterate in InventoryOne
    public void print() {
        Iterator inventoryoneitrate = inventoryOne.iterator();
        System.out.print("This is the list of customizable car in central inventory: \033[0m \n");
        printInventory(inventoryoneitrate);
    }

    public void setUserPass(String user, String pass){
        this.email = user;
        this.pass = pass;
        System.out.print("Customer with email " + email + " is logged-in \n");
    }
    private void printInventory(Iterator iterator) {
        while (iterator.hasNext()) {
            InventoryItem inventoryItem = (InventoryItem) iterator.next();

            System.out.print("\u001B[36m "+ inventoryItem.car.getModel() + "\n");

        }
    }
}