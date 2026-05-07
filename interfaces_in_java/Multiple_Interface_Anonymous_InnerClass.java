package interfaces_in_java;




interface P
{
    String Name = "Vamsi";  
    int Age = 21;

    void show(); 
    void display();
}
interface X
{
    void run();
}
interface Y extends X
{
    //an empyt interface block.
}

public class Multiple_Interface_Anonymous_InnerClass
{
    public static void main(String[] args)
    {
        P obj = new P()
        {
            public void show()
            {
                System.out.println("Hello");
            }
            public void display()
            {
                System.out.println("Welcome");
            }
    
        };
        obj.show();
        System.out.println(P.Name+" "+P.Age);
        obj.display();

        X obj1 = new X()
        {
            public void run()
            {
                System.out.println("How are You?");
            }
        };
        obj1.run();
    }
}
