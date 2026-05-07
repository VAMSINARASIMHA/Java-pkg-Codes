package interfaces_in_java.functional_interface;

@FunctionalInterface
interface MyFunctionalInterface 
{
    void myMethod();
}
public class Functional_Interface_Using_Anonymous_InnerClass
{
    public static void main(String[] args) 
    {
        MyFunctionalInterface obj = new MyFunctionalInterface()
        {
            public void myMethod() 
            {
                System.out.println("Hello from MyClass!");
            }
        };
        obj.myMethod();
    }
}