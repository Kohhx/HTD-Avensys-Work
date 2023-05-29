package String;

public class Day10_03052023_2 {
    public static void main(String[] args) {

        String s1 = new String("Hi I am He Xiang");
        System.out.println(s1);
        System.out.println("************************");
        System.out.println(s1.toUpperCase());
        System.out.println("************************");
        System.out.println(s1.toLowerCase());
        System.out.println("************************");
        System.out.println(s1.contains("He Xiang"));
        System.out.println("************************");
        System.out.println(s1.contains("Leon"));
        System.out.println("************************");
        System.out.println(s1.indexOf("X"));
        System.out.println("************************");
        System.out.println(s1.charAt(3));
        System.out.println("************************");
        System.out.println(s1.substring(3));
        System.out.println("************************");
        System.out.println(s1.substring(8, 16));
        System.out.println("************************");
        System.out.println(s1.replace(" ", "*"));
        System.out.println("************************");
        System.out.println(s1.startsWith("H"));
        System.out.println("************************");
        System.out.println(s1.startsWith("Z"));
        System.out.println("************************");

    }
}
