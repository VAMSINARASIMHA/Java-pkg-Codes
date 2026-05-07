package interfaces_in_java.functional_interface;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();                               //an interface with only one abstract method.
}
class MyClass implements MyFunctionalInterface {
    @Override
    public void myMethod() {
        System.out.println("Hello from MyClass!");
    }
}
public class Functional_Interface_SAM {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}
