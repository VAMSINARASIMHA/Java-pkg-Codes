package Anonymous_class;
class A{
    void show(){
        System.out.println("HAI");
    }
}
public class Anonymous_Inner_Class
{
    public static void main(String...args)
    {
        A obj = new A()
        {
            @Override
            void show()
            {
                System.out.println("Hello");  //it overrides the show method of class A.
            }
        };
        obj.show();
    }
}