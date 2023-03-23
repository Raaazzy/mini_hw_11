package org.example;

public interface Subject {
    void register(Observer observer);

    void remove(Observer observer);

    void notifyObservers();
}
