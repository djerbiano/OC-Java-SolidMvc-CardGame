package com.openClassrooms.cardgame.games;

import com.openClassrooms.cardgame.controller.GameController;
import com.openClassrooms.cardgame.model.Deck;
import com.openClassrooms.cardgame.view.View;

public class Games {

    public static void main(String[] args) {
       GameController gc = new GameController(new Deck(), new View(), new HighCardGameEvaluator());
        //GameController gc = new GameController(new Deck(), new View(), new LowCardGameEvaluator());

        gc.run();

    }

}
