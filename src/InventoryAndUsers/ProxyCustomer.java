package InventoryAndUsers;

public class ProxyCustomer extends User {
    private Customer customer;

    public ProxyCustomer() {

    }

    String pass;
    String email;

    public ProxyCustomer(String pass, String email) {

        setEmail(email);
        setPass(pass);

    }



    public String getPass() {
        return pass;
    }

    public void setUserPass(String user, String pass){
        this.email = user;
        this.pass = pass;
        System.out.print("Customer with " + email + " is logged-in through a third-party secure authentication \n");
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInventory(){
        customer.print();
    }

}
