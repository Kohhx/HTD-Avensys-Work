package Methods;

import java.util.Scanner;

class Compare {

    boolean checkString(String name, String s) {
        return name.toLowerCase().contains(s);
    }

    boolean stringCompare(String s1, String s2) {
        return s1.equals(s2);
    }

    String stringGreater(String s1, String s2) {
        return s1.compareTo(s2) > 0 ? s1 : s2;
    }

    boolean checkString2(String name) {
        char charArray[] = name.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 's' || charArray[i] == 'S') {
                return true;
            }
        }
        return false;
    }
}


public class Day12_05052023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Compare c = new Compare();

        System.out.println("Check which string is greater");
        System.out.println("-----------------------------");
        System.out.print("Input String 1: ");
        String s3 = sc.nextLine();
        System.out.print("Input String 2: ");
        String s4 = sc.nextLine();
        System.out.println(c.stringGreater(s3, s4) + " is greater!");
        System.out.println();

        System.out.println("Check which string contain char 'S' or 's");
        System.out.println("-----------------------------");
        System.out.print("Input Name: ");
        String name = sc.next();
        boolean result = c.checkString2(name);
        if (result) {
            System.out.println("String contains s or S");
        } else {
            System.out.println("String does not contain s or S");
        }
        System.out.println();

		System.out.println("Character Checker");
		System.out.println("-----------------------------");
		System.out.print("Input Name: ");
		String name1 = sc.next();
		System.out.print("\nInput char to check: ");
		String s = sc.next();
		System.out.println();
		System.out.println(checkString(name1, s));

		System.out.println("2 Strings compare");
		System.out.println("-----------------------------");
		System.out.print("Input String 1: ");
		String s1 = sc.nextLine();
		System.out.print("Input String 2: ");
		String s2 = sc.nextLine();

		boolean result1 = c.stringCompare(s1, s2);
		if (result1) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}

    }

	private static boolean checkString(String name, String s) {
		return name.toLowerCase().contains(s);
	}

	private static boolean stringCompare(String s1, String s2) {
		return s1.equals(s2);
	}

}
