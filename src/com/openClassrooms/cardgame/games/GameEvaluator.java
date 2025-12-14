package com.openClassrooms.cardgame.games;

import com.openClassrooms.cardgame.model.Player;
import com.openClassrooms.cardgame.model.PlayingCard;

import java.util.List;

public interface GameEvaluator {
    public Player evaluateWinner(List<Player> players);
}
