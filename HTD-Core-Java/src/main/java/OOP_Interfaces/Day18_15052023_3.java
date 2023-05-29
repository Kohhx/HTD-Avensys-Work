package OOP_Interfaces;


import java.util.Scanner;

interface CalculateSimpleInterest {
    public void acceptInput();

    public void findSI();

    public void display();
}

class BusinessMan1 implements CalculateSimpleInterest {

    static int r = 2;
    double p;
    int t;
    double SI;

    @Override
    public void acceptInput() {
        p = 10000;
        t = 2;
    }

    @Override
    public void findSI() {
        SI = (p * r * t) / 100;

    }

    @Override
    public void display() {
        System.out.println("Business Man 1 Simple interest: " + SI);
    }

}

class BusinessMan2 implements CalculateSimpleInterest {

    static int r = 2;
    double p;
    int t;
    double SI;

    Scanner sc = new Scanner(System.in);

    @Override
    public void acceptInput() {
        System.out.print("Input prinicple amount: ");
        p = sc.nextDouble();
        System.out.print("Input time: ");
        t = sc.nextInt();
    }

    @Override
    public void findSI() {
        SI = (p * r * t) / 100;

    }

    @Override
    public void display() {
        System.out.println("Business Man 2 Simple interest: " + SI);
    }

}

class BusinessMan3 implements CalculateSimpleInterest {

    static int r = 2;
    double p;
    int t;
    double SI;

    Scanner sc = new Scanner(System.in);

    @Override
    public void acceptInput() {
        System.out.print("Input prinicple amount: ");
        p = sc.nextDouble();

        if (p < 0) {
            System.out.println("Please enter a positive amount");
            return;
        }

        System.out.print("Input time: ");
        t = sc.nextInt();

        if (t < 0) {
            System.out.println("Please enter a a positive value");
            return;
        }
    }

    @Override
    public void findSI() {
        SI = (p * r * t) / 100;

    }

    @Override
    public void display() {
        if (t < 0 || p < 0) {
            System.out.println("Cannot compute Simple interest." + "Please input a positive principle amount "
                    + "and positive time value");
        } else {
            System.out.println("Business Man 3 Simple interest: " + SI);
        }
    }

}

class Business {
    public void acceptBusinessMan(CalculateSimpleInterest ref) {
        ref.acceptInput();
        ref.findSI();
        ref.display();
    }
}

public class Day18_15052023_3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BusinessMan1 bm1 = new BusinessMan1();
        BusinessMan2 bm2 = new BusinessMan2();
        BusinessMan3 bm3 = new BusinessMan3();
        Business business = new Business();

        System.out.println("Business Man 1");
        System.out.println("=======================");
        business.acceptBusinessMan(bm1);
        System.out.println();
        System.out.println("Business Man 2");
        System.out.println("=======================");
        business.acceptBusinessMan(bm2);
        System.out.println();
        System.out.println("Business Man 3");
        System.out.println("=======================");
        business.acceptBusinessMan(bm3);
        System.out.println();
    }
}
