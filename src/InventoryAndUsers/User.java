package InventoryAndUsers;

public abstract class User {
    String Pass;
    String email;
    public User(){}
    public User(String Pass, String email) {
        this.Pass = Pass;
        this.email = email;
    }
}
