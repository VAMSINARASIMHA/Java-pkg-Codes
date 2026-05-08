//Multiple Inheritance Using Interfaces in Java.

// interface A{
//     void show();
// }
// interface B{
//     void display();
// }
// class C implements A,B{
//     public void show(){
//         System.out.println("in show");
//     }
//     public void display(){
//         System.out.println("in display");
//     }
// }
// public class Multiple_And_Hybrid_Inheritance_Using_Interfaces{
//     public static void main(String[] args){
//         C obj = new C();
//         obj.show();
//         obj.display();
//     }
// }





//Hybrid Inheritance Using Interfaces in Java.

interface A{
    void show();
}
interface B{
    void display();
}
class C{
    void test(){
        System.out.println("in test");
    }
}
class D extends C implements A,B{
    public void show(){
        System.out.println("in show");
    }
    public void display(){
        System.out.println("in display");
    }
}
public class Multiple_And_Hybrid_Inheritance_Using_Interfaces{
    public static void main(String[] args){
        D obj = new D();
        obj.test();
        obj.show();
        obj.display();
    }
}
