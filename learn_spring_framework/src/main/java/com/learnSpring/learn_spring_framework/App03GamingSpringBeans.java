package com.learnSpring.learn_spring_framework;

import com.learnSpring.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

        try (var context =
                     new AnnotationConfigApplicationContext
                             (GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

//        var marioGame = new MarioGame();
//        var superContraGame = new SuperContraGame();
//        var pacManGame = new PacManGame();
//
//        var gameRunner1 = new GameRunner(marioGame);
//        var gameRunner2 = new GameRunner(superContraGame);
//        var gameRunner3 = new GameRunner(pacManGame);
//
//        gameRunner1.run();
//        gameRunner2.run();
//        gameRunner3.run();
    }
}
