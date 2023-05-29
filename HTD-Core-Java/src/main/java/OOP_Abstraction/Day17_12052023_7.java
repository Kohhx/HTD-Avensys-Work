package OOP_Abstraction;

abstract class Teacher {

    abstract void teach();

    abstract void doExp();

}

class PhysicTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Physics teacher is teaching");
    }

    @Override
    public void doExp() {
        System.out.println("physic teacher doing experiment");
    }

}

class ChemistryTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Chemistry teacher is teaching");
    }

    @Override
    public void doExp() {
        System.out.println("Chemistry teacher doing experiment");
    }

}

class BiologyTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Biology teacher is teaching");
    }

    @Override
    public void doExp() {
        System.out.println("Biology teacher doing experiment");
    }

}

class College {
    public void acceptTeacher(Teacher teacher) {
        teacher.teach();
        teacher.doExp();
    }
}

public class Day17_12052023_7 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Teacher pt = new PhysicTeacher();
        Teacher ct = new ChemistryTeacher();
        Teacher bt = new BiologyTeacher();

        College college = new College();
        college.acceptTeacher(pt);
        college.acceptTeacher(ct);
        college.acceptTeacher(bt);

    }
}
