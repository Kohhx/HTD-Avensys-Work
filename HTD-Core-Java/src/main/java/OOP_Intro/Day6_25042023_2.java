package OOP_Intro;
class Fan {
    String color;
    String brand;
    int noOfBlades;

    void rotate() {
        System.out.println("Fan is rotating!");
    }

    void stop() {
        System.out.println("Fan is stopping!");
    }

    void blowAir() {
        System.out.println("Fan is blowing air!");
    }
}

public class Day6_25042023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Fan dyson = new Fan();
        Fan mitsubishi = new Fan();
        Fan panasonic = new Fan();

        dyson.rotate();
        dyson.blowAir();
        dyson.stop();
    }
}
