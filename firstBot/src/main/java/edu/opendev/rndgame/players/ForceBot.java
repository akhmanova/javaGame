package edu.opendev.rndgame.players;

import edu.opendev.rndgame.GameCore;

/**
 * Created by elina on 04.05.17.
 */
public class ForceBot implements Player {

    private String name;

    private int answer = 0;

    public ForceBot(String name) {
        this.name = name;
    }

    public ForceBot() {
        this.name = "Force-бот";
    }

    @Override
    public int getAnswer(GameCore.Response response) {
        return ++answer;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void reset() {

    }
}
