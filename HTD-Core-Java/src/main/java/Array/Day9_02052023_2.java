package Array;

import java.util.Scanner;

public class Day9_02052023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        // Copy array program
        System.out.println("Array copy program");
        System.out.println("-----------------");
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Input " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }

        System.out.println("\nlst Array created with the size of " + len);

        System.out.println("\nPrinting 1st array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int b[] = new int[a.length];
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }

        System.out.println("\n\n2nd array copied");

        System.out.println("\nPrinting 2st array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

        // Copy array program (Reverse)
        System.out.println("Reverse Array copy program");
        System.out.println("-----------------");
        System.out.print("Enter length of array: ");
        int len1 = sc.nextInt();
        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Input " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }

        System.out.println("\nlst Array created with the size of " + len1);

        System.out.println("\nPrinting 1st array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int b[] = new int[a.length];
        for (int i = 0; i < len; i++) {
            b[i] = a[a.length - i - 1];
        }

        System.out.println("\n\n2nd array copied");

        System.out.println("\nPrinting 2st array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }

        // Find key in array
        System.out.println("Find key in array");
        System.out.println("-----------------");
        System.out.print("Enter length of array: ");
        int len = sc.nextInt();
        int a[] = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.print("Input " + (i + 1) + " :");
            a[i] = sc.nextInt();
        }

        System.out.println("\nlst Array created with the size of " + len);

        System.out.println("\nPrinting 1st array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\n\nInput key to find: ");
        int key = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                System.out.print("\nKey found at index: " + i);
                return;
            }
        }
        System.out.print("\nKey not found!");
    }
}
