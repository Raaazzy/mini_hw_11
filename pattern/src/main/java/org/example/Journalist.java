package org.example;

public class Journalist implements Observer {
    @Override
    public void refresh(String gameTitle, String gameAchievements, String gameInfo, String technicalData) {
        System.out.println("Новая игра: " + gameTitle);
        System.out.println("Информация: " + gameInfo);
    }
}
