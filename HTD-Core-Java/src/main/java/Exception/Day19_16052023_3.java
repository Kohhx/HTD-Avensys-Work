package Exception;

class Demo1 {
	public void alpha() {
		System.out.println("Connection 3 Established");
		try {
			alpha();
			return;
		} catch (Error e) {
			System.out.println("Caught the error");
		}
		System.out.println("Connection 3 is closed");
	}
}

public class Day19_16052023_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1 = new Demo1();
		d1.alpha();
	}

}
