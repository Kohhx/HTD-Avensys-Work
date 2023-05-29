package Exception;

import java.util.Scanner;

class InvalidInputException extends Exception {

	@Override
	public String getMessage() {
		return "Invalid Input! We are blocking your car. " + "Please reach out to the bank";
	}
}

class ATM {
	int accNo = 111;
	int password = 9999;
	int ac;
	int pw;

	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		ac = sc.nextInt();
		System.out.print("Enter password: ");
		pw = sc.nextInt();
	}

	public void verify() throws InvalidInputException {
		if (accNo == ac && password == pw) {
			System.out.println("Hey valid user, collect your money");
		} else {
			throw new InvalidInputException();
//			System.out.println("Invalid user");
		}
	}
}

class Bank {

	public void initiate() {
		ATM atm = new ATM();
		try {
			atm.acceptInput();
			atm.verify();
		} catch (InvalidInputException e) {
			System.out.println("You have 2 chances left");
			try {
				atm.acceptInput();
				atm.verify();
			} catch (InvalidInputException e1) {
				System.out.println("You have 1 chances left");
				try {
					atm.acceptInput();
					atm.verify();
				} catch (InvalidInputException e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
}

public class Day20_17052023_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.initiate();

	}

}
