package Loops_Patterns;

import java.util.Scanner;

public class Day2_19042023_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.println("--------- 1 ---------");
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 2 ---------");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 3 ---------");
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i >= 2 && i < n) && (j >= 2 && j < n)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("--------- 4 ---------");
        System.out.println();


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == 5) {
                    System.out.print("* ");
                } else if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 6 ---------");
        System.out.println();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == n - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 7 ---------");
        System.out.println();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (j == 0 || j == n - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("--------- 8 ---------");
        System.out.println(" Only work for 5 rows");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == 2 || j - i == 2 || i - j == 2 || (j == n - 2 && i == n - 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();
//

        System.out.println("--------- 9 ---------");
        System.out.println("Heart Shape");
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && (j == 1 || j == 2 || j == 4 || j == 5)) || (i == 1 && (j % 3 == 0)) || i - j == 2 || i + j == 8) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();


        System.out.println("--------- 10 ---------");
        System.out.println("Arrow Up");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (i + j == 4 || j - i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();


        scanner.close();
    }
}
