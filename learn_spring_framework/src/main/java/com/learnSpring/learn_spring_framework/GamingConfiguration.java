package com.learnSpring.learn_spring_framework;

import com.learnSpring.learn_spring_framework.game.GameRunner;
import com.learnSpring.learn_spring_framework.game.GamingConsole;
import com.learnSpring.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacManGame();
    }

    @Bean
    public GameRunner gameRunner() {
        return new GameRunner(game());
    }

}
