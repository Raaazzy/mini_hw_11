package org.example;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Journalist journalist = new Journalist();
        Developer developer = new Developer();

        Game gameConsole = new Game();
        gameConsole.register(player);
        gameConsole.register(journalist);
        gameConsole.register(developer);
        gameConsole.create("Reversi", "игрок понял правила", "захватывающая дух игра", "нужен очень мощный игровой компьютер");
        gameConsole.remove(developer);

        System.out.println();
        gameConsole.create("Шашки", "игрок стал армянином", "Для людей серьезных, умных, для людей с соображеньем " +
                "только шашки служат нынче благородным развлеченьем", "компьютер не требуется, нужно только воображение");
        gameConsole.remove(player);

        System.out.println();
        gameConsole.create("Шахматы", "игрок научился ставить детский мат", "когда-то из этой игры сбежал популярный на ПИ сферический конь", "компьютер не требуется, требуется парк и пару стариков");
        gameConsole.remove(journalist);
    }
}