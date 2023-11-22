package com.learnSpring.learn_spring_framework.game;

public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move up");
    }

    @Override
    public void down() {
        System.out.println("Move down");
    }

    @Override
    public void left() {
        System.out.println("Run from the bad guy");
    }

    @Override
    public void right() {
        System.out.println("Eat chrystal");
    }
}
