package edu.opendev.rndgame;

import edu.opendev.rndgame.players.*;

/**
 * Created by elina on 04.05.17.
 */
public class App {

    public static void main(String[] args) {
        //Player player = new HumanPlayer("Ivan");
        //Player player = new ForceBot();
        //Player player = new DiBot();
        //Player player = new DiRndBot();
        Player player = new ForceRndBot();

        GameCore gc = new GameCore(player);
        gc.start();
    }

}
