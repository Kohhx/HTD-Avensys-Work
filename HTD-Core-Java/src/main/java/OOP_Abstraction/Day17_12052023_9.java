package OOP_Abstraction;

abstract class Animal {
    abstract public void walk();

    abstract public void eat();
}

abstract class Cat extends Animal {

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Cats walk on fours");

    }
}

abstract class Human extends Animal {
    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println("Human walks on two!");
    }
}

class Lion extends Cat {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Lion hunts and eat deers");
    }
}

class Tiger extends Cat {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Tiger hunts and eat goats");
    }
}

class Boy extends Human {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Boys eats rice");
    }
}

class Girl extends Human {
    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Girls eat noodle");
    }
}

class Earth {
    public void acceptAnimal(Animal animal) {
        animal.walk();
        animal.eat();
    }
}

public class Day17_12052023_9 {
    public static void main(String[] args) {
        Lion l = new Lion();
        Tiger t = new Tiger();
        Boy b = new Boy();
        Girl g = new Girl();
        Earth earth = new Earth();
        earth.acceptAnimal(l);
        earth.acceptAnimal(t);
        earth.acceptAnimal(b);
        earth.acceptAnimal(g);
    }
}
