package edu.opendev.rndgame.players;

import edu.opendev.rndgame.GameCore;

/**
 * Created by elina on 04.05.17.
 */
public class DiBot implements Player {

    private String name;

    private int left = 1;
    private int right = 100;
    private int answer = 50;

    public DiBot(String name) {
        this.name = name;
    }

    public DiBot() {
        this.name = "DiBot";
    }

    @Override
    public int getAnswer(GameCore.Response response) {
        if(response == GameCore.Response.LEFT) {
            this.left = this.answer;
        } else if (response == GameCore.Response.RIGHT){
            this.right = this.answer;
        }
        this.answer = this.left + (this.right - this.left + 1) / 2;

        System.out.println(answer);
        return this.answer;
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
        this.left = 1;
        this.right = 100;
        this.answer = 50;
        this.name = "DiBot";
    }
}
