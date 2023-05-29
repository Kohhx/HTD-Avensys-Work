package OOP_Interfaces;
interface Calculator {
    public int mul();

    public int div();
}

class MyCal1 implements Calculator {

    @Override
    public int mul() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int div() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class MyCal2 implements Calculator {

    @Override
    public int mul() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int div() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class MyCal3 implements Calculator {

    @Override
    public int mul() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int div() {
        // TODO Auto-generated method stub
        return 0;
    }

}

class Math {
    public void acceptCalculator(Calculator calculator) {
        calculator.mul();
        calculator.div();
    }
}

public class Day18_15052023_1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyCal1 mc1 = new MyCal1();
        MyCal2 mc2 = new MyCal2();
        MyCal3 mc3 = new MyCal3();
        Math math = new Math();
        math.acceptCalculator(mc1);
        math.acceptCalculator(mc2);
        math.acceptCalculator(mc3);
    }
}
