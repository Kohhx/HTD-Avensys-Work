package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day19_16052023_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Connection established");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Numerator: ");
			int a = sc.nextInt();
			System.out.println("Enter Denominator: ");
			int b = sc.nextInt();
			int c = a / b;
			System.out.println("The result is: " + c);
			System.out.println("Enter Length of array: ");
			int len = sc.nextInt();
			int arr[] = new int[len];
			System.out.println("Enter Element: ");
			int el = sc.nextInt();
			System.out.println("Enter Position: ");
			int pos = sc.nextInt();

			arr[pos] = el;
		} catch (ArithmeticException ae) {
			System.out.println("Hey user, do not pass zero as denominator");
		} catch (NegativeArraySizeException ne) {
			System.out.println("Input only positive value");
		} catch (InputMismatchException ie) {
			System.out.println("Input a valid integer value");
		} catch (ArrayIndexOutOfBoundsException oe) {
			System.out.println("Input a valid index to store the value");
		} catch (Exception e) {
			System.out.println("Some error has occured");
		} finally {
			System.out.println("Connection is closed");
		}
	}

}
