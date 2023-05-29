package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Day19_16052023_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Connection established");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Numerator: ");
			int a = sc.nextInt();
			System.out.print("Enter Denominator: ");
			int b = sc.nextInt();
			int c = (a % b) + 5 * 100;
			System.out.println("The result is: " + c);

			System.out.println();

			System.out.print("Enter Length of array size: ");
			int len = sc.nextInt();
			int arr[] = new int[len];
			System.out.print("Enter element value: ");
			int el = sc.nextInt();
			System.out.print("Enter index position to store element: ");
			int pos = sc.nextInt();
			arr[pos] = el;

		} catch (ArithmeticException ae) {
			System.out.println("Input a non-zero value!");
		} catch (NegativeArraySizeException ne) {
			System.out.println("Input only positive value!");
		} catch (InputMismatchException ie) {
			System.out.println("Input a valid integer value!");
		} catch (ArrayIndexOutOfBoundsException oe) {
			System.out.println("Input a valid index to store the value!");
		} catch (Exception e) {
			System.out.println("Some error has occured");
		} finally {
			System.out.println("Connection closed!");
		}
	}

}
