package Loops_Patterns;

public class Day1_18042023_1 {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("---------P1--------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("---------P2--------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("---------P3--------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("---------P4--------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print("^");
            }
            System.out.println();
        }


        System.out.println("-------------------");
        System.out.println("---------P5--------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("-------------------");
        System.out.println("---------P6-HW------");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("-------------------");
        System.out.println("---------P7-HW------");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("-------------------");
        System.out.println("---------P8-HW------");
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
