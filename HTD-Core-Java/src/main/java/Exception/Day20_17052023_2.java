package Exception;

class DemoOne {
	public void greet() throws Exception {
		System.out.println("Hello Team");
	}
}

class DemoTwo extends DemoOne {
	@Override
	// Liskov's first principle say that overiding method
	// May not need to throw Exception
	// Liskov's Second principle if going to throw, the exception thrown must have a is-a relationship
	// With the exception thrown in parent class
	public void greet() throws ArithmeticException { // is-a relationship
//	public void greet() {
		System.out.println("Hello from HX");
	}
}

public class Day20_17052023_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
