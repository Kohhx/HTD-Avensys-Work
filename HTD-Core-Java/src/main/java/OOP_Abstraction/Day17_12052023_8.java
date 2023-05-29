package OOP_Abstraction;

abstract class Bird {
    abstract public void fly();

    abstract public void eat();
}

abstract class Eagle extends Bird {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Eagles are flying at high altitude");

    }

}

abstract class Sparrow extends Bird {

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Sparrow are flying at low altitude");

    }

}

class GoldenEagle extends Eagle {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Golden eagles hunt and eats fish");
    }

}

class SerpantEagle extends Eagle {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Serpent eagles eats ");
    }

}

class VegSparrow extends Eagle {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Veg sparrow eats grains");
    }

}

class NonVegSparrow extends Eagle {

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("Non-Veg sparrow eats insects");
    }

}

class Sky {
    public void acceptBirds(Bird bird) {
        bird.fly();
        bird.eat();
    }
}

public class Day17_12052023_8 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GoldenEagle ge = new GoldenEagle();
        SerpantEagle se = new SerpantEagle();
        VegSparrow vs = new VegSparrow();
        NonVegSparrow nvs = new NonVegSparrow();
        Sky s = new Sky();
        s.acceptBirds(ge);
        s.acceptBirds(se);
        s.acceptBirds(vs);
        s.acceptBirds(nvs);
    }
}
