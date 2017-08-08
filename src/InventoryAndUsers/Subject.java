package InventoryAndUsers;

import Enums.Model;

public interface Subject {
    void RegisterObserver(Observer observer);
    void RemoveObserver(Observer observer);
    void NotifyObservers(Model model);
}

