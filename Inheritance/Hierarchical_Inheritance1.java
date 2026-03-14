package Inheritance;

class X{
    void show(){
        System.out.println("Method of class A");
    }
}
class Y extends X{
    void display(){
        System.out.println("Method of class B");
    }
}
class Z extends X{
    void test(){
        System.out.println("Method of class C");
        this.show();
    }
}
public class Hierarchical_Inheritance1 {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();

        Y obj2 = new Y();
        obj2.display();
        
        obj.test();

    }
}
