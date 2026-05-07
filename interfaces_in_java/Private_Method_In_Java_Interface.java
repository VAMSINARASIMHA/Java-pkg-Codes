package interfaces_in_java;
interface Demo {
    default void show() {
        helper();
    }

    private void helper() {
        System.out.println("Private method inside interface");
    }
}
class B implements Demo {
    public void display() {
        show();
    }
}
public class Private_Method_In_Java_Interface {
    public static void main(String[] ar){
        B obj = new B();
        obj.display();
    }
}