package org.example;

public class Developer implements Observer {
    @Override
    public void refresh(String gameTitle, String gameAchievements, String gameInfo, String technicalData) {
        System.out.println("Новая игра: " + gameTitle);
        System.out.println("Технические данные: " + technicalData);
    }
}
