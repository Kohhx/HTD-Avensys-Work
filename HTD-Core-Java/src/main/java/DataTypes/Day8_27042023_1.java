package DataTypes;

public class Day8_27042023_1 {
    public static void main(String[] args) {

		byte a = 45;
		short b = a; // Implicit type casting which can fit into short
		System.out.println(b);

		// Show what primitive type example
		System.out.println(((Object) b).getClass().getName());

		float c = 3.14f;
		double d = c; // Implicit type casting
		double e = 3.14;
		System.out.println(c);

		// Interesting when float goes into double. It has many trailing decimals from
		// float
		System.out.println(d);
		System.out.println(e);

		int f = 45;
		byte g;
		// Going from larger data type to smaller types need to be explicit type case
		g = (byte) f;
		System.out.println(f);

		double h = 3.1422222222222222222222222222222222228;
		float i = (float) h; // Implicit type casting
		System.out.println(h);
		System.out.println(i);

		int j = 129;
		byte k;
		// Going from larger data type to smaller types need to be explicit type case
		k = (byte) j;
		System.out.println(k);

        // Implicit
        System.out.println("Implicit Conversion");
        System.out.println("-------------------");
        byte aa = 20;
        short bb = aa;
        System.out.println("byte to short: " + bb);

        int cc = 500000;
        long dd = cc;
        System.out.println("int to long: " + dd);

        float ee = 10.15f;
        double ff = ee;
        System.out.println("float to double: " + ff);

        char gg = 'A';
        int hh = gg;
        System.out.println("char to int: " + hh);
        System.out.println();

        System.out.println("Explicit Conversion");
        System.out.println("-------------------");
        // Explicit
        short ii = 20;
        byte jj = (byte) ii;
        System.out.println("short to byte: " + jj);

        long kk = 500000;
        int ll = (int) kk;
        System.out.println("long to int: " + ll);

        double mm = 10.15;
        float nn = (float) mm;
        System.out.println("double to float: " + nn);

        int oo = 65;
        char pp = (char) oo;
        System.out.println("int to char: " + pp);
    }
}
