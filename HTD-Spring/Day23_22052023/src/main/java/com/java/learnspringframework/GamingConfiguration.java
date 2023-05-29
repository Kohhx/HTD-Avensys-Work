package com.java.learnspringframework;


import game.GameRunner;
import game.GamingConsole;
import game.MarioGame;
import game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class GamingConfiguration {
    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

    @Bean
    @Primary
    public GamingConsole game() {
        return new MarioGame();
    }

    @Bean
    public GamingConsole superContraGame() {
        return new SuperContraGame();
    }

}