package inner_class;

class A
{
    int a=10;
    void show()
    {
        System.out.println("HAI");
    }
    class B
    {
        int b=20;
        void display()
        {
            System.out.println("VAMSI");
            System.out.println(a+b);
        }
    }
}
public class Inner_class{
    public static void main(String[] ar){
        A obj = new A();
        A.B obj1 = obj.new B();
        obj.show();
        obj1.display(); 
        System.out.println(obj.a+obj1.b);
    }
}
