package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Day8_28042023_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];

        System.out.println("Please enter the 1st student marks");
        marks[0] = sc.nextInt();
        System.out.println("Please enter the 2nd student marks");
        marks[1] = sc.nextInt();
        System.out.println("Please enter the 3rd student marks");
        marks[2] = sc.nextInt();
        System.out.println("Please enter the 4th student marks");
        marks[3] = sc.nextInt();
        System.out.println("Please enter the 5th student marks");
        marks[4] = sc.nextInt();
        System.out.println();

        // Display the values of array
        System.out.println("Marks present below");
        System.out.println("1st student marks is: " + marks[0]);
        System.out.println("2nd student marks is: " + marks[1]);
        System.out.println("3rd student marks is: " + marks[2]);
        System.out.println("4th student marks is: " + marks[3]);
        System.out.println("5th student marks is: " + marks[4]);

        // Display the array in one go
        System.out.println(Arrays.toString(marks));

//        Using while loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please enter " + (i + 1) + " student marks");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + " student marks is: " + marks[i]);
        }

        System.out.println(Arrays.toString(marks));

        // Example with for loop age array and switch(lamda)
        System.out.println("For loop Example");
        System.out.println("-------------------");
        //		 Input
        int ages[] = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Please enter " + (i + 1) + getSuffix(i) + " student age");
            ages[i] = sc.nextInt();
        }

        // Output
        for (int i = 0; i < ages.length; i++) {
            System.out.println((i + 1) + getSuffix(i) + " student age is: " + ages[i]);
        }
        System.out.println(Arrays.toString(ages));
        System.out.println();

        // Example with while loop age array and switch(lamda)
        // Input
        System.out.println("While loop Example");
        System.out.println("-------------------");
        int ages1[] = new int[10];
        int ii = 0;
        int jj = 0;
        while (ii < ages1.length) {
            System.out.println("Please enter " + (ii + 1) + getSuffix(ii) + " student age");
            ages1[ii] = sc.nextInt();
            ii++;
        }

        // Output
        while (jj < ages1.length) {
            System.out.println((jj + 1) + getSuffix(jj) + " student age is: " + ages1[jj]);
            jj++;
        }
        System.out.println(Arrays.toString(ages1));
        System.out.println();

        // Do while loop
        System.out.println("Do While loop Example");
        System.out.println("---------------------");
        int ages2[] = new int[10];
        int kk = 0;
        int ll = 0;
        do {
            System.out.println("Please enter " + (kk + 1) + getSuffix(kk) + " student age");
            ages2[kk] = sc.nextInt();
            kk++;

        } while (kk < ages2.length);

        do {
            System.out.println((ll + 1) + getSuffix(ll) + " student age is: " + ages2[ll]);
            ll++;

        } while (ll < ages2.length);
        System.out.println(Arrays.toString(ages2));
        System.out.println();

    }

    private static String getSuffix(int i) {
        return switch (i) {
            case 0 -> "st";
            case 1 -> "nd";
            case 2 -> "rd";
            default -> "th";
        };
    }



}
