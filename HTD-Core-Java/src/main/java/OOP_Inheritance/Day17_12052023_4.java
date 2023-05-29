package OOP_Inheritance;
// Control flow assignments
class Object {
    public Object() {

    }
}

class Demo1 extends Object {
    int a;
    int b;

    public Demo1() {
        a = 10;
        b = 20;
    }

    public Demo1(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Demo2 extends Demo1 {

    public Demo2() {
        a = 100;
        b = 200;
    }

    public Demo2(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
}
public class Day17_12052023_4 {
    public static void main(String[] args) {

        Demo2 d2 = new Demo2(1000, 2000);
        System.out.println(d2.a);
        System.out.println(d2.b);
    }
}
