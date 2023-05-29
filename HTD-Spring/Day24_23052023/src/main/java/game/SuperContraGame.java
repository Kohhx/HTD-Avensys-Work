package game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("Ducking");
	}

	@Override
	public void left() {
		System.out.println("Going back");
	}

	@Override
	public void right() {
		System.out.println("Shooting at enemy and move foward");
	}

}
