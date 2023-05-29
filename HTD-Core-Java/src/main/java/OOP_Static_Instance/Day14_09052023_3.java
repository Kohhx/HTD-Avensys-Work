package OOP_Static_Instance;

class DemoStatic {
    static int a, b, c;

    static {
        a = 10;
        b = 20;
        c = 30;
    }

    static void display1() {
        // Static output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Static methods cannot access instance variables
//		Instance output -> ERROR
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);

    }

    int d, e, f;
    {
        d = 500;
        e = 600;
        f = 700;

    }

    void display2() {
        // Static Output
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Instance Output
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}


public class Day14_09052023_3 {
}
