package Methods;

class Calculator2 {

    // Type 1: No I/P and O/P
    void add() {
        int a = 3;
        int b = 3;
        int c = a + b;
        System.out.println(c);
    }

    // Type 2: I/P and No O/P
    void add2(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    // Type 3: I/P and No O/P
    int add3() {
        int a = 3;
        int b = 3;
        int c = a + b;
        return c;
    }

    // Type 4: I/P and O/P
    int add4(int a, int b) {
        int c = a + b;
        return c;
    }

}

class Calculator3 {

    int add(int x, int y) {
        return x + y;
    }

    float add(int x, float y) {
        return x + y;
    }

    float add(float x, int y) {
        return x + y;
    }

    int add(int x, int y, int z) {
        return x + y + z;
    }

    float add(float x, float y, float z) {
        return x + y + z;
    }

}

public class Day12_05052023_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calculator2 c = new Calculator2();
        c.add();

        int a = 20;
        int b = 30;

        c.add2(a, b);
        System.out.println(c.add3());
        System.out.println(c.add4(10, 50));

        Calculator3 c3 = new Calculator3();
        System.out.println(c3.add(10, 20));
        System.out.println(c3.add(10.5f, 20));

        String s1 = new String("This is Java Class");

        // Virtual polymophorism ===> Method overloading
        s1.substring(1);
        s1.substring(1, 5);

    }
}
