package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_28042023_3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println(a.length);

		// 2D Array
		int b[][] = new int[5][3];
		System.out.println(b.length);
		System.out.println(b[0].length);

		// 3D Array or multidimensional
		int c[][][] = new int[5][3][2];
		System.out.println(c.length);
		System.out.println(c[0].length);
		System.out.println(c[0][0].length);

		int d[][] = new int[2][3];

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.println("Input class " + (i + 1) + " student " + (j + 1) + " :");
				d[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.println("class " + (i + 1) + " student " + (j + 1) + " mark: " + d[i][j]);
			}
		}

		System.out.println(Arrays.deepToString(d));

        int customer[][] = new int[5][3];
//
        System.out.println("Bank");
        System.out.println("-----------");
        for (int i = 0; i < customer.length; i++) {
            for (int j = 0; j < customer[i].length; j++) {
                System.out.print("Input bank " + (i + 1) + " customer " + (j + 1) + " amount:");
                customer[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < customer.length; i++) {
            for (int j = 0; j < customer[i].length; j++) {
                System.out.println("Bank " + (i + 1) + " customer " + (j + 1) + " amount: " + customer[i][j]);
            }
        }

        System.out.println("Zagged 2D array");
        System.out.println("-----------");
        int e[][] = new int[4][];

        e[0] = new int[1];
        e[1] = new int[2];
        e[2] = new int[3];
        e[3] = new int[99];

        for (int[] ii : e) {
            System.out.println(ii.length);
        }

//	private static String getSuffix(int i) {
//		return switch (i) {
//		case 0 -> "st";
//		case 1 -> "nd";
//		case 2 -> "rd";
//		default -> "th";
//		};
    }

}
