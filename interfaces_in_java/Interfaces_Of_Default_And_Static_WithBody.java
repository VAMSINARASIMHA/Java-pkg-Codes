package interfaces_in_java;
interface A{
    void show();
    default void test(){
        System.out.println("HAI");
    }
    static void display(){
        System.out.println("Vamsi");
    }
}
class B implements A{
   public void show(){
        System.out.println("How are you?");
    }
}
public class Interfaces_Of_Default_And_Static_WithBody{
    public static void main(String[] ar){
        A obj = new B();
        obj.test();   //default method accessing object
        A.display(); //static method accessing object through interface name.
        obj.show();
    }
}
