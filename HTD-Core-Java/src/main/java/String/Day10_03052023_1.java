package String;

public class Day10_03052023_1 {
    public static void main(String[] args) {

        String s1 = "Kohhx";
        String s2 = "Kohhx";

        if (s1 == s2) {
            System.out.println("Reference Address are the same.");
            System.out.println("Both s1 and s2 are pointing to the same address in the string constant pool");
        } else {
            System.out.println("References are not the same!");
        }

        if (s1.equals(s2)) {
            System.out.println("String contents are the same");
        } else {
            System.out.println("String contents are not the same");
        }

        String s3 = new String("Kohhx");
        String s4 = new String("Kohhx");

        System.out.println();
        if (s3 == s4) {
            System.out.println("Reference Address are the same.");
            System.out.println("Both s1 and s2 are pointing to the same address in the string constant pool");
        } else {
            System.out.println("References are not the same!");
            System.out.println("Both reference are created in the non constant pool!");
        }

        String ss = "Hello";
        ss.concat("world");
        System.out.println(ss);

        // INteresting> If concatenating between 2 variables, object wil be created in
        // non-constant pool
        String s5 = "qqq";
        String s6 = s5;

        String s7 = s5 + s6;
        String s8 = s5 + s6;

        // Different
        if (s7 == s8) {
            System.out.println("Reference Address are the same.");
            System.out.println("Both s1 and s2 are pointing to the same address in the string constant pool");
        } else {
            System.out.println("References are not the same!");
        }

        // Same
        if (s5 == s6) {
            System.out.println("Reference Address are the same.");
            System.out.println("Both s1 and s2 are pointing to the same address in the string constant pool");
        } else {
            System.out.println("References are not the same!");
        }

        String a1 = new String("leon");
        // Move from non constant pool to constant pool
        a1 = a1.intern();
        String a2 = a1;
        String a3 = "leon";
        System.out.println("Start");
        checkStringVaraible(a1, a2);
        checkStringVaraible(a2, a3);

        String b1 = "abcde";
        String b2 = "akdjd";

        System.out.println(b1.charAt(0) - b2.charAt(0));
        System.out.println(b1.compareTo(b2));
    }

    public static void checkStringVaraible(String s1, String s2) {
        if (s1 == s2) {
            System.out.println("Reference Address are the same.");
            System.out.println("Both s1 and s2 are pointing to the same address in the string constant pool");
        } else {
            System.out.println("References are not the same!");
        }
    }
}
