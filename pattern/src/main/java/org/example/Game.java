package org.example;

import java.util.ArrayList;
import java.util.List;

public class Game implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String gameName;
    private String gameAchievements;
    private String gameInfo;
    private String computerInfo;

    public void create(String gameTitle, String gameAchievements, String gameInfo, String technicalData) {
        this.gameName = gameTitle;
        this.gameAchievements = gameAchievements;
        this.gameInfo = gameInfo;
        this.computerInfo = technicalData;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.refresh(gameName, gameAchievements, gameInfo, computerInfo);
        }
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }
}
