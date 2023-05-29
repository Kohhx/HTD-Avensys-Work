package OOP_Constructor;

class Student {
	private String name;
	private int age;
	private String city;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Student(int age, String name, String city) {
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

}

class Fan1 {
    private String model;
    private int wingNo;
    private double price;

    public Fan1() {
    }

    public Fan1(String model) {
        this("Mitsubishi", 5);
        this.model = model;
    }

    public Fan1(String model, int wingNo) {
        this("pansonic", 4, 99.99);
        this.model = model;
        this.wingNo = wingNo;
    }

    public Fan1(String model, int wingNo, double price) {
        this();
        this.model = model;
        this.wingNo = wingNo;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getWingNo() {
        return wingNo;
    }

    public double getPrice() {
        return price;
    }

}
public class Day14_09052023_1 {
    public static void main(String[] args) {
        Fan1 f = new Fan1("Dyson");
        System.out.println("Fan Model: " + f.getModel());
        System.out.println("Fan Wing No: " + f.getWingNo());
        System.out.println("Fan Price: " + f.getPrice());

    }
}
