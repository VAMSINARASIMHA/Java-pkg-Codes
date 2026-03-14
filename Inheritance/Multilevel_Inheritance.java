package Inheritance;

class A{
    void show(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    void display(){
        System.out.println("Method of class B");
    }
}
class C extends B{
    void test(){
        System.out.println("Method of class C");
        this.show();
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
        c.test();
    }
}
