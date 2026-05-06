package Anonymous_class;

abstract class B
{
    public abstract void show();
    public abstract void display();
}
public class Anonymous_Inner_Class_Using_Abstract
{
    public static void main(String[] args)
    {
        B obj = new B() 
        {
            @Override
            public void show()
            {
                System.out.println("HAI");
            }
            @Override
            public void display()
            {
                System.out.println("VAMSI");
            }
        };
        obj.show();
        obj.display();
    }
}
