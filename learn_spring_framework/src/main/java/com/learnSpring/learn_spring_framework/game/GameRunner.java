package com.learnSpring.learn_spring_framework.game;

import com.learnSpring.learn_spring_framework.game.MarioGame;

public class GameRunner {

    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
