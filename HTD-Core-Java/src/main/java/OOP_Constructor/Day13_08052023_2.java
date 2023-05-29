package OOP_Constructor;

/* Constructor Chaining */
// It is the process of child class constructor calling parent constructor through the super method
class Object {
    // Logic for object creation

    public Object() {
        // Initialize the child class instance variable
    }
}

class Student3 {
    String name; // Instance variable
    int age; // Instance variable
    String city; // Instance variable

    public Student3() {
    }

    // COnstructor. 1) Same name as class, Call once when object is created
    public Student3(String name, int age, String city) { // <------ Local variable

        super(); // By default the first line to be called is super. If we dont't declare, it
        // will be called automatically by JVM
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

}

public class Day13_08052023_2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
}
