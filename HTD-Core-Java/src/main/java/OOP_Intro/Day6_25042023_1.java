package OOP_Intro;

class Student {
    String name;
    int age;
    int mark;

    public void play() {
        System.out.println("Student is playing!");
    }

    public void read() {
        System.out.println("Student is reading!");
    }

    public void eat() {
        System.out.println("Student is eating!");
    }
}

class Bird {
    String name;
    String color;
    String type;

    public void fly() {
        System.out.println("Bird is flying!");
    }

    public void eat() {
        System.out.println("Bird is eating!");
    }

    public void makeSound() {
        System.out.println("Bird is making sound!");
    }

}

public class Day6_25042023_1 {
    public static void main(String[] args) {
        Student siddu = new Student();
        Student silas = new Student();
        Student hexiang = new Student();
//		System.out.println(student.read());

        Bird parrot = new Bird();
        Bird duck = new Bird();
        Bird pigeon = new Bird();
        pigeon.makeSound();
    }
}
