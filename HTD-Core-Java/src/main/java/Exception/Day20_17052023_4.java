package Exception;

import java.util.Scanner;

class UnderAgeException extends Exception {
	@Override
	public String getMessage() {
		return "You are under age! Cannot use Match finder application";
	}
}

class OverAgeException extends Exception {
	@Override
	public String getMessage() {
		return "You are over age! Cannot use Match finder application";
	}
}

class AgeVerification {
	int age;

	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		age = sc.nextInt();
	}

	public void verify() throws UnderAgeException, OverAgeException {
		if (age < 18) {
			throw new UnderAgeException();
		} else if (age > 45) {
			throw new OverAgeException();
		} else {
			System.out.println("Registered successfully! You can " + "" + "start using the matchfinder application!");
		}
	}
}

class MatchFinderApp {

	public void initiate() {
		AgeVerification r = new AgeVerification();
		try {
			r.acceptInput();
			r.verify();
		} catch (UnderAgeException ue) {
			System.out.println(ue.getMessage());
		} catch (OverAgeException oe) {
			System.out.println(oe.getMessage());
		}
	}
}

public class Day20_17052023_4 {

	public static void main(String[] args) {
		System.out.println("Starting Match Finder application");
		System.out.println();
		System.out.println("Age verification process");
		System.out.println("=====================================");
		MatchFinderApp mfa = new MatchFinderApp();
		mfa.initiate();
	}

}
