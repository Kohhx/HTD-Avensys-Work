package OOP_Interfaces;
interface Cal1 {
    int count = 200;

}

//interface Cal1 {
//	public final static int count = 0;
//
//	public abstract void add();
//
//	public abstract void sub();
//}

class MyCal4 implements Cal1 {
    public void display() {
        System.out.println(count);
    }
}

// AFter JDK 1.8: We can create static and default methods within interface
interface Bank {
    static void minAmount() {

        System.out.println("Min 0");

    }

    default void maxAmount() {
        System.out.println("Max 0");
    }
}

class MyBank implements Bank {

}
public class Day18_15052023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Cal1.count);

        MyCal4 c = new MyCal4();
        c.display();

        MyBank b = new MyBank();

        // Interface and call static method directly
        Bank.minAmount();

        // Object do not need to implement default methods declared in interface
        b.maxAmount();

    }
}
