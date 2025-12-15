package com.openClassrooms.cardgame.view;

import java.util.Scanner;

import com.openClassrooms.cardgame.controller.GameController;

public class CommandeLineView implements GameViewable {

	GameController controller;
	Scanner keyBoard = new Scanner(System.in);

	public void setController(GameController gc) {
		this.controller = gc;

	}

	public void promptForPlayerName() {
		System.out.println("Enter Player Name:");
		String name = keyBoard.nextLine();
		if (name.isEmpty()) {
			controller.startGame();
		} else {
			controller.addPlayer(name);
		}

	}

	public void pomptForFlip() {
		System.out.println("Press enter to reveal cards");
		keyBoard.nextLine();
		controller.flipCards();

	}

	public void promptForNewGame() {
		System.out.println("Press enter to deal again or +q to exit");
		controller.nextAction(keyBoard.nextLine());


	}

	public void showWinner(String playerName) {
		System.out.println("Winner is " + playerName + " !");

	}

	public void showPlayerName(int playerIndex, String playerName) {
		System.out.println("[" + playerIndex + "][" + playerName + "]");

	}

	public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
		System.out.println("[" + playerIndex + "][" + playerName + "][X][X]");

	}

	public void showCardForPlayer(int i, String playerName, String rank, String suit) {
		System.out.println("[" + i + "][" + playerName + "][" + rank + "][" + suit + "]");

	}
}
