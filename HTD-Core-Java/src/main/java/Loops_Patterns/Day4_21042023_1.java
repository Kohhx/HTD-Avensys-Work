package Loops_Patterns;

public class Day4_21042023_1 {

    public static void main(String[] args) {
		System.out.println("Patter Day 4");
		System.out.println();

		System.out.println("--------- 1 ---------");
		System.out.println();
		int start;
		for(int i=0; i<6; i++) {
			start = 65;
			for(int j=0; j<=i; j++) {
				System.out.print((char)start++);
			}
			System.out.println();
		}
		System.out.println();



		System.out.println("--------- 2 ---------");
		System.out.println();
		int start1;
		for(int i=0; i<6; i++) {
			start1 = 65;
			for(int j=6-i-1; j>0; j--) {
				System.out.print(" ");
			}

			for(int j=0; j<=i; j++) {
				System.out.print((char)start1 + " ");
				start1++;
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("--------- 3 ---------");
		System.out.println();
		int start2 = 65;
		for(int i=0; i<6; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)start2);
			}
			start2++;
			System.out.println();
		}
		System.out.println();

		System.out.println("--------- 4 ---------");
		System.out.println("Initialize asci by using program to convert to int");
		for(int i=0, start3='a'; i<6; i++, start3++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)start3);
			}
			System.out.println();
		}
		System.out.println();

//		System.out.println("--------- 5 ---------");
//		System.out.println();
//		int i =0;
//		for(System.out.println("Hello"); i<6; i++) {
//			System.out.println("...");
//		}
//		System.out.println();
//
//		System.out.println("--------- 6 ---------");
//		System.out.println();
//		int ii =0;
//		for(System.out.println("Hi"); ii<6; System.out.println("World")) {
//			System.out.println("Hello");
//			ii++;
//		}
//
//		System.out.println();


		System.out.println("--------- 7 ---------");
		System.out.println();
		for(int i=0, start3='E'; i<5 ;i++,start3--) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)start3);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("--------- 8 ---------");
		System.out.println();
		for(int i=0, alpha='A'; i<5 ;i++,alpha+=2) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)alpha);
			}
			System.out.println();
		}
		System.out.println();


		System.out.println("--------- 9 ---------");
		System.out.println();
		for(int i=0 ; i<5 ;i++ ) {
			for(int j=0; j<=i; j++) {
				if (i%2==0) {
					System.out.print('A');
				} else {
					System.out.print('B');
				}
			}
			System.out.println();
		}
		System.out.println();

        System.out.println("--------- 10 ---------");
        System.out.println();
        int alpha1;
        for(int i=0 ; i<5 ;i++) {
            alpha1 = 'E';
            for(int j=0; j<=i; j++) {
                System.out.print((char)alpha1--);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 11 ---------");
        System.out.println();
        for(int i=5,alpha2 ='E'; i>0 ;i--, alpha2--) {
            for(int j=0; j<5-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<i; j++) {
                System.out.print((char)(alpha2-j));
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("--------- 12 ---------");
        System.out.println();
        int start4;
        int n = 5;
        for(int i=0; i<n; i++) {
            start4 = 'A';
            for(int j=n-i-1; j>0; j--) {
                System.out.print(" ");
            }

            for(int j=0; j<=i+i; j++) {
                System.out.print((char)start4++ + "");
            }

            System.out.println();
        }
        System.out.println();
    }
}
