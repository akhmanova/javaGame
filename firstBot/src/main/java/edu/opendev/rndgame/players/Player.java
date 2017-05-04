package edu.opendev.rndgame.players;

import edu.opendev.rndgame.GameCore;

/**
 * Created by elina on 04.05.17.
 */
public interface Player {

    int getAnswer(GameCore.Response response);
    String getName();
    void setName(String name);


    void reset();
}
