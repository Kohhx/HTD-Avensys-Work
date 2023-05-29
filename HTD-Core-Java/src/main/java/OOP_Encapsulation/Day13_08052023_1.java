package OOP_Encapsulation;

class Book {

    private int pgNo = 20;

    public void setPageNumber(int n) {
        if (n > 0) {
            this.pgNo = n;
        } else {
            System.out.println("Invalid page number input");
        }
    }

    public int getPageNumber() {
        return pgNo;
    }

}

class Fan {

    private double amount = 10.0;

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Invalid amount. Amount must be more than 0");
        }
    }

    public double getAmount() {
        return amount;
    }

}

class Student {
    String name; // Instance variable
    int age; // Instance variable
    String city; // Instance variable

    public Student() {
    }

    // COnstructor. 1) Same name as class, Call once when object is created
    public Student(String name, int age, String city) { // <------ Local variable
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Never do this. Use Constructor
    public void setData(String name, int age, String city) {
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

public class Day13_08052023_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Book b = new Book();

        b.setPageNumber(-9);
        b.setPageNumber(100);

        System.out.println(b.getPageNumber());

        /*
         * 1) Encapsulation It is the indirect access and control to the most important
         * member of the object.
         */
        Fan f = new Fan();
        System.out.println("Original fan amount: " + f.getAmount());

        System.out.println("Setting fan amount to 100...");
        f.setAmount(35.99);
        System.out.println("Updated fan amount: " + f.getAmount());

        Student student1 = new Student();
        student1.setData("Koh", 32, "Singapore");
        System.out.println(student1.getName());

        Student student2 = new Student("Leon", 27, "SG");
        System.out.println(student2.getName());

    }
}
