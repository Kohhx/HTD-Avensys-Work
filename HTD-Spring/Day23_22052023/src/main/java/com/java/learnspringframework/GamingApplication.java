package com.java.learnspringframework;

import game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamingApplication {
    public static void main(String[] args) {
//    var game = new MarioGame();
//    var gameRunner = new GameRunner(game);
//    gameRunner.run();
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            GameRunner gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
