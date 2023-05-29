package OOP_Static_Instance;

import java.util.Scanner;

class Student1 {
    String name;
    int age;
    int mark;
    static String collegeName = "NUS";

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name:");
        name = sc.nextLine();
        System.out.print("Enter student age:");
        age = sc.nextInt();
        System.out.print("Enter student mark:");
        mark = sc.nextInt();
    }

    public void display() {
        System.out.println();
        System.out.println("Displaying student info....");
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student mark: " + mark);
        System.out.println("Student college: " + collegeName);
    }

}

public class Day15_10052023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        Student1 s3 = new Student1();
        System.out.println();

        System.out.println("Student 1");
        System.out.println("==================");
        s1.acceptInput();
        s1.display();
        System.out.println();

        System.out.println("Student 2");
        System.out.println("==================");
        s2.acceptInput();
        s2.display();
        System.out.println();

        System.out.println("Student 3");
        System.out.println("==================");
        s3.acceptInput();
        s3.display();
        System.out.println();

    }
}
