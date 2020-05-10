package co.devfoundry;

import co.devfoundry.patterns.singleton.task.GuessGame;

public class Main {

    public static void main(String[] args) {
        GuessGame game = GuessGame.getInstance();

        game.play();
        game.getScore();


    }

}
