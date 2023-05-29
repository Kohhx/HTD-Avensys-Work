package DataTypes;

public class Day7_26042023_1 {
    // byte - Decimal (1 byte)
    public static void main(String[] args) {
        byte a;
        a = 45;
        System.out.println(a);

        // Hexdecimal
        byte aa;
        aa = 0x45;
        System.out.println(aa);

        // Binary
        byte aaa;
        aaa = 0b101101;
        System.out.println(aaa);

        // Octal
        byte aaaa;
        aaaa = 055;
        System.out.println(aaaa);

        // short (2 bytes)
        short b;
        b = 200;
        System.out.println(b);

        // int (4 bytes)
        int c;
        c = 3500;
        System.out.println(c);

        // long (Require suffix L, 8 bytes)
        long d;
        d = 2147483648L;
        System.out.println(d);

        // From decimal to binary/octa
        int t = 2;
        int n = 32767;
        String r;
        StringBuilder ss = new StringBuilder();
        while (n > 0) {
            r = Integer.toString(n % t);
//			System.out.println(r);
            ss.insert(0, r);
            n /= t;
        }

        System.out.println(ss);

        // Float datatypes (Require suffix f, 4 bytes)
        float e;
        e = 25.17f;
        System.out.println(e);

        // Double datatypes (8 bytes)
        double f;
        f = 25.17;
        System.out.println(f);

        // Char datatypes (2 bytes)
        char ch;
        ch = 'Z';
        System.out.println(ch);
    }
}
