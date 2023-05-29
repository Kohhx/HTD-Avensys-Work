package Array;

import java.util.Scanner;

public class Day9_02052023_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer[][] = new int[5][];
        customer[0]=new int[3];
        customer[1]=new int[1];
        customer[2]=new int[4];
        customer[3]=new int[5];
        customer[4]=new int[2];

        System.out.println("Bank 2D Zagged Array");
        System.out.println("-----------");
        for(
                int i = 0;
                i<customer.length;i++)

        {
            for (int j = 0; j < customer[i].length; j++) {
                System.out.print("Input bank " + (i + 1) + " customer " + (j + 1) + " amount:");
                customer[i][j] = sc.nextInt();
            }
        }

        for(
                int i = 0;
                i<customer.length;i++)

        {
            for (int j = 0; j < customer[i].length; j++) {
                System.out.println("Bank " + (i + 1) + " customer " + (j + 1) + " amount: " + customer[i][j]);
            }
        }
        System.out.println();

        System.out.println("Student Marks 3D Array");
        System.out.println("-----------");

        int marks[][][] = new int[3][3][4];
        for(
                int i = 0;
                i<marks.length;i++)

        {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out
                            .print("Input College " + (i + 1) + " Class " + (j + 1) + " Student " + (k + 1) + " mark:");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();

        System.out.println("Output Student Marks");
        System.out.println("-----------");
        for(
                int i = 0;
                i<marks.length;i++)

        {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("College " + (i + 1) + " Class " + (j + 1) + " Student " + (k + 1) + " mark: "
                            + marks[i][j][k]);
                }
            }
        }
        System.out.println();

        System.out.println("Bank Customer amount 3D zagged Array");
        System.out.println("-----------");
        int amounts[][][] = new int[3][][];

        // Bank
        amounts[0]=new int[3][];
        amounts[1]=new int[4][];
        amounts[2]=new int[2][];

        // Branch 0
        amounts[0][0]=new int[4];
        amounts[0][1]=new int[2];
        amounts[0][2]=new int[3];

        // Branch 1
        amounts[1][0]=new int[1];
        amounts[1][1]=new int[2];
        amounts[1][2]=new int[4];
        amounts[1][3]=new int[2];

        // Branch 2
        amounts[2][0]=new int[5];
        amounts[2][1]=new int[2];

        for(
                int i = 0;
                i<amounts.length;i++)

        {
            for (int j = 0; j < amounts[i].length; j++) {
                for (int k = 0; k < amounts[i][j].length; k++) {
                    System.out.print(
                            "Input Bank " + (i + 1) + " Branch " + (j + 1) + " Customer " + (k + 1) + " amount:");
                    amounts[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();

        System.out.println("Customer amount output");
        System.out.println("-----------");
        for(
                int i = 0;
                i<amounts.length;i++)

        {
            for (int j = 0; j < amounts[i].length; j++) {
                for (int k = 0; k < amounts[i][j].length; k++) {
                    System.out.println("Bank " + (i + 1) + " Branch " + (j + 1) + " Customer " + (k + 1) + " amount: "
                            + amounts[i][j][k]);
                }
            }
        }
        System.out.println();

        System.out.println("Student Marks 3D zagged Array");
        System.out.println("-----------");
        int marks[][][] = new int[3][][];

        // Colleges
        marks[0]=new int[3][];
        marks[1]=new int[2][];
        marks[2]=new int[4][];

        // Class 1
        marks[0][0]=new int[3];
        marks[0][1]=new int[2];
        marks[0][2]=new int[4];

        // Class 2
        marks[1][0]=new int[5];
        marks[1][1]=new int[3];

        // Class 3
        marks[2][0]=new int[1];
        marks[2][1]=new int[4];
        marks[2][2]=new int[2];
        marks[2][3]=new int[3];

        for(
                int i = 0;
                i<marks.length;i++)

        {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out
                            .print("Input College " + (i + 1) + " Class " + (j + 1) + " Student " + (k + 1) + " mark:");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println();

        System.out.println("Student marks output");
        System.out.println("-----------");
        for(
                int i = 0;
                i<marks.length;i++)

        {
            for (int j = 0; j < marks[i].length; j++) {
                for (int k = 0; k < marks[i][j].length; k++) {
                    System.out.println("College " + (i + 1) + " Class " + (j + 1) + " Student " + (k + 1) + " mark: "
                            + marks[i][j][k]);
                }
            }
        }
        System.out.println();
    }
}
