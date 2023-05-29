package OOP_Inheritance;

class Teacher {
    void markAttendance() {
        System.out.println("Teacher is marking attendance");
    }

    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class PhysicTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Physics teacher is teaching");
    }

    void labExpPhy() {
        System.out.println("Physic teacher is doing experiment");
    }
}

class BiologyTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Biology teacher is teaching");
    }

    void labExpBio() {
        System.out.println("Biology teacher is doing experiment");
    }
}

public class Day17_12052023_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PhysicTeacher pt = new PhysicTeacher();
        pt.teach();
        pt.labExpPhy();

        BiologyTeacher bt = new BiologyTeacher();
        bt.teach();
        bt.labExpBio();

        Teacher pt2 = new PhysicTeacher();
        pt2.teach();
		pt2.labExpPhy(); // Error cause ref is teacher. Teacher does not have labExpPhy method

        Teacher t = new Teacher();
        t.teach();
    }
}
