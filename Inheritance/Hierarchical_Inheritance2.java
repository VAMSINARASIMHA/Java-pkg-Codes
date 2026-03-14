package Inheritance;

class Person {
    void speak() {
        System.out.println("Person speaks");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student studies");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher teaches");
    }
}

class Principal extends Person {
    void manage() {
        System.out.println("Principal manages");
    }
}

class HeadMaster extends Person {
    void test() {
        System.out.println("HeadMaster manages");
    }
}

public class Hierarchical_Inheritance2{
    public static void main(String[] args) {

        Student s = new Student();
        s.speak();
        s.study();

        Teacher t = new Teacher();
       // t.speak();
        t.teach();

        Principal p = new Principal();
        //p.speak();
        p.manage();

        HeadMaster h = new HeadMaster();
        //h.speak();
        h.test();
    }
}
