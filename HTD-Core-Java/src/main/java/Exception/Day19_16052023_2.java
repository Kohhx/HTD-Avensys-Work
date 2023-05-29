package Exception;

import java.util.Scanner;

class DemoOne {
	public void alpha() {
		System.out.println("Connection 3 Established");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a = scan.nextInt();
		System.out.println("Enter the Denominator");
		int b = scan.nextInt();
		int c = a / b;
		System.out.println("Result is :" + c);
		System.out.println("Connection 3 is closed");
	}
}

class DemoTwo {
	public void beta() {
		System.out.println("Connection 2 is establish");
		DemoOne d1 = new DemoOne();
		d1.alpha();
		System.out.println("Connection 2 is closed");
	}
}

class DemoThree {
	public void gamma() {
		System.out.println("Connection 1 is establish");
		DemoTwo d2 = new DemoTwo();
		d2.beta();
		System.out.println("Connection 1 is closed");
	}
}

public class Day19_16052023_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main connection is established");
		DemoThree d3 = new DemoThree();
		d3.gamma();
		System.out.println("Main connection is closed");
	}

}
