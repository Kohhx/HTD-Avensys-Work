package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

//	private MarioGame game;
	private GamingConsole game;

	// Autowire through constructor
	// Qualifier has high priority than Primary
	public GameRunner(@Qualifier("pacman") GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running the game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
