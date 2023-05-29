package OOP_Inheritance;

class Demo1 {

    int a = 10;

    public void greet() {
        System.out.println("Hello Team from Demo 1!");
    }
}

class Demo2 extends Demo1 {
    @Override
    public void greet() {
        System.out.println("Hello Team from Demo 2!");
    }
}

class Demo3 extends Demo2 {

    @Override
    public void greet() {
        System.out.println("Team 3");
    }

}

public class Day17_12052023_1 {
    public static void main(String[] args) {

        Demo3 d3 = new Demo3();
        System.out.println(d3.a);
        d3.greet();

    }
}
