package OOP_Inheritance;
class DemoOne {
    int a = 10;
    int b = 20;

    public DemoOne() {
        System.out.println("Demo 1 constructor called!");
    }

    public void greet() {
        System.out.println("Hello Team!");
    }
}

class DemoTwo extends DemoOne {

    // Constructor does not particpate in inheritance
//	public DemoOne() {
//		System.out.println("Demo 1 constructor called!");
//	}

//	@Override
//	public void greet() {
//		System.out.println("Hello Team2!");
//	}

    public DemoTwo() {
        super();
    }
}

public class Day15_10052023_4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DemoTwo d2 = new DemoTwo();
//		d2.greet();

    }
}
