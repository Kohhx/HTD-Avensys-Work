package OOP_Static_Instance;

import java.util.Scanner;

class BusinessMan {
    int p;
    int t;
    static float r = 2f;
    float SI;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        p = sc.nextInt();
        System.out.println("Enter the time:");
        t = sc.nextInt();
    }

    public void findSimpleInterest() {
        SI = (p * r * t) / 100;
    }

    public void display() {
        System.out.println("Simple interest is: " + SI);
    }

}

public class Day15_10052023_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BusinessMan b1 = new BusinessMan();
        BusinessMan b2 = new BusinessMan();
        BusinessMan b3 = new BusinessMan();

        b1.acceptInput();
        b1.findSimpleInterest();
        b1.display();
        System.out.println("******************");
        b2.acceptInput();
        b2.findSimpleInterest();
        b2.display();
        System.out.println("******************");

    }
}
