package OOP_Inheritance;

class Parent {
    void greet() {
        System.out.println("Hello Team from parent class");
    }
}

class Child extends Parent {

    @Override
    void greet() {
        System.out.println("Hello Team from Child class");
    }
}

class Animal {

}

class Tiger extends Animal {

}

class Human {
	public Animal objectCreation() {
		Animal a = new Animal();
		return a;
	}

}

class Baby extends Human {

	@Override
	public Tiger objectCreation() {
		Tiger a = new Tiger();
		return a;
	}
}

public class Day17_12052023_3 {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
