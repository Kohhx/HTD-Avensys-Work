package String;

public class Day11_04052023_1 {
    public static void main(String[] args) {

		String s11 = "Siddu";
		String s22 = "siddu";

		System.out.println(s11.equals(s22));
		System.out.println(s11.equalsIgnoreCase(s22));

		// Mutable String

		StringBuffer sb = new StringBuffer("Hello World!");
		System.out.println(sb);

		sb.append(" I am He Xiang");
		System.out.println(sb);

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());

		// String builder

		StringBuilder sbb = new StringBuilder("Hello World!");
		System.out.println(sbb);

		sbb.append(" I am He Xiang");
		System.out.println(sbb);

		StringBuilder sbb1 = new StringBuilder();
		System.out.println(sbb1.capacity());
		sbb1.append("This is Java Class");
		System.out.println(sbb1.capacity());
//

        StringBuilder s1 = new StringBuilder("Hi I am He Xiang");
        System.out.println(s1);
        System.out.println("************************");
        System.out.println(s1.equals(s1));
        System.out.println("************************");
        System.out.println(s1.compareTo(s1));
        System.out.println("************************");
        System.out.println(s1.indexOf("He Xiang"));
        System.out.println("************************");
        System.out.println(s1.charAt(3));
        System.out.println("************************");
        System.out.println(s1.substring(3));
        System.out.println("************************");
        System.out.println(s1.substring(8, 16));
        System.out.println("************************");
        System.out.println(s1.append("! Hello world!"));
        System.out.println("************************");
        System.out.println(s1.insert(0, "How are you! "));
        System.out.println("************************");
        System.out.println(s1.reverse());
        System.out.println("************************");
        System.out.println("Before ensure capacity: " + s1.capacity());
        s1.ensureCapacity(67);
        System.out.println("After ensure capacity of: " + s1.capacity());
        System.out.println("************************");
        System.out.println(s1.length());
        System.out.println("************************");
        System.out.println(s1.capacity());
        System.out.println("************************");
    }
}
