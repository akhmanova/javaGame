package edu.opendev.rndgame.players;

import edu.opendev.rndgame.GameCore;

import java.util.Scanner;

/**
 * Created by elina on 04.05.17.
 */
public class HumanPlayer implements Player {

    private String name;

    public HumanPlayer() {
        this.name = "Без имени";
    }

    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public int getAnswer(GameCore.Response response) {
        System.out.println("введите ответ:");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        return n;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {

    }
}
