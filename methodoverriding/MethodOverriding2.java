package methodoverriding;


class A{
    void show(){
        System.out.println("show method in class A");
    }
    void display(){
        System.out.println("display method in class A");
    }
}
class B extends A{
    @Override // this is annotation it is used to indicate that the method is overriding a method in the superclass and it is optional but it is good practice to use it because it helps to catch errors at compile time if the method is not actually overriding a method in the superclass.
    void show(){
        System.out.println("show method in class B");
    }
}
public class MethodOverriding2 {
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.display();
    }
}