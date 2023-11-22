package com.learnSpring.learn_spring_framework;

import com.learnSpring.learn_spring_framework.game.GameRunner;
import com.learnSpring.learn_spring_framework.game.MarioGame;
import com.learnSpring.learn_spring_framework.game.PacManGame;
import com.learnSpring.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var pacManGame = new PacManGame();

        var gameRunner1 = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(superContraGame);
        var gameRunner3 = new GameRunner(pacManGame);

        gameRunner1.run();
        gameRunner2.run();
        gameRunner3.run();
    }
}
