package Inheritance;

class P{
    void show(){
        System.out.println("Method of class p");
    }
}
class Q extends P{
    void display(){
        System.out.println("Method of class Q");
    }
}
class R extends Q{
    void test(){
        System.out.println("Method of class R");
    }
}
class S extends R{
    void test1(){
        System.out.println("Method of class S");
        this.show();
    }
}
public class Multilevel_Inheritance1 {
    public static void main(String[] args) {
        S obj = new S();
        obj.show();
        obj.display();
        obj.test();
        obj.test1();
    }
}
