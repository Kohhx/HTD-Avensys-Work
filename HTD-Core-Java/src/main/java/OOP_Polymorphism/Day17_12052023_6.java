package OOP_Polymorphism;
class Animal {
    void eat() {
        System.out.println("Animal is eating!");
    }

    void sleep() {
        System.out.println("Animal is sleeping!");
    }

}

class Tiger extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger is eating!");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is sleeping!");
    }

}

class Lion extends Animal {

    @Override
    void eat() {
        System.out.println("Lion is eating!");
    }

    @Override
    void sleep() {
        System.out.println("Lion is sleeping!");
    }

}

class Dog extends Animal {

    @Override
    void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping!");
    }

}

class Forest {
    public void acceptAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
    }
}

public class Day17_12052023_6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Tiger t = new Tiger();
        Lion l = new Lion();
        Dog d = new Dog();
        Forest forest = new Forest();
        forest.acceptAnimal(t);
        forest.acceptAnimal(l);
        forest.acceptAnimal(d);
    }
}
