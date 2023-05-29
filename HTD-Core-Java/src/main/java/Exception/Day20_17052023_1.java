package Exception;

import java.util.Scanner;

class Demo1 {

	public void alpha() {
		try {
			System.out.println("Connection 1 is estd");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter numerator: ");
			int a = sc.nextInt();
			System.out.print("Enter denominator: ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Error: Denominator cannot be " + e.getMessage());
			e.printStackTrace();
			throw e;
		} finally {
			System.out.println("Connection 1 is closed");
		}

	}
}

class Demo2 {

	public void alpha() throws Exception {
		try {
			System.out.println("Connection 1 is estd");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter numerator: ");
			int a = sc.nextInt();
			System.out.print("Enter denominator: ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println(c);
		} finally {
			System.out.println("Connection 1 is closed");
		}

	}
}

public class Day20_17052023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		d1.alpha();
		Demo2 d2 = new Demo2();
		d2.alpha();
	}

}
