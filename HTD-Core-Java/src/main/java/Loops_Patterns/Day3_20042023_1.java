package Loops_Patterns;

import java.util.Scanner;

public class Day3_20042023_1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int r = scanner.nextInt();

		System.out.println("--------- 1 ---------");
		System.out.println();
		int n=1;
		for (int i = 0; i<5; i++) {
			for (int j = 0; j<3 ; j++) {
				System.out.print(n + " ");
//				System.out.print("%-5d".formatted(n));
				n++;
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 2 ---------");
		System.out.println();

			for (int i = 0; i<=4; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}

		System.out.println();


		System.out.println("--------- 3 ---------");
		System.out.println();
			for (int i = 5; i>0; i--) {
			for (int j = 0; j<i ; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 4 ---------");
		System.out.println();
		int nn =10;
		for (int i = 0; i<=nn; i++) {
			int temp = i;
			for (int j = 0; j<=i ; j++) {
				if (j==0) {
					System.out.print(i+1 + " ");
					temp= i+1;
				} else {
					System.out.print(temp+nn-j+1 + " ");
					temp = temp + nn-j+1;
				}

			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 5 ---------");
		System.out.println();
		int count = 1;
			for (int i = 0; i<=3; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 6 ---------");
		System.out.println();
			for (int i = 0; i<=3; i++) {
				for (int j = 0; j<=i ; j++) {
					System.out.print(j+1 + " ");
				}
				for (int j = i; j>0 ; j--) {
					System.out.print(j + " ");
				}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 7 ---------");
		System.out.println();
		int count1 = 10;
			for (int i = 0; i<=3; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print(count1 + " ");
				count1--;
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 8 ---------");
		System.out.println();
			for (int i = 0; i<=4; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print(i+1-j + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 9 ---------");
		System.out.println();
			for (int i = 0; i<=4; i++) {
			for (int j = i; j>=0 ; j--) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 10 ---------");
		System.out.println();
		int num;
			for (int i = 0; i<=4; i++) {
				num = (i%2) ==0 ? 0 : 1;
				for (int j = 0; j<=4 ; j++) {
					System.out.print(num + " ");
					num = (num==0) ? 1 : 0;
				}
			System.out.println();
		}

		System.out.println();

		System.out.println("--------- 11 ---------");
		System.out.println();
			for (int i = 0; i<=4; i++) {
			for (int j = 0; j<=i ; j++) {
				System.out.print(i+1 + " ");
			}
			System.out.println();
		}

		System.out.println();


        System.out.println("--------- 12 ---------");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(5 - j + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("--------- 13 ---------");
        System.out.println();
        int num1;
        for (int i = 0; i < 5; i++) {
            num1 = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num1 + " ");
                num1 = (num1 == 0) ? 1 : 0;
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("--------- 14 ---------");
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
