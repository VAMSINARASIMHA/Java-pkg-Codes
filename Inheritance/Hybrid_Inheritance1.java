package Inheritance;

class Employee {
    void work() {
        System.out.println("Employee works");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer writes code");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager manages team");
    }
}

class SeniorDeveloper extends Developer {
    void review() {
        System.out.println("Senior Developer reviews code");
    }
}

public class Hybrid_Inheritance1 {

    public static void main(String[] args) {

        Developer obj1 = new Developer();
        obj1.work();
        obj1.code();

        Manager obj2 = new Manager();
        //obj2.work();
        obj2.manage();

        SeniorDeveloper obj3 = new SeniorDeveloper();
        //obj3.work();
        //obj3.code();
        obj3.review();
    }
}
