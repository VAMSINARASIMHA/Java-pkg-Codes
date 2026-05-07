package interfaces_in_java;


interface A{
    String name = "Vamsi";   
    int age = 21;

    void show();             
    void display();
}
public class Single_Interface_Anonymous_InnerClass{
    public static void main(String[] args){
        A obj = new A()
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
        obj.display();
        System.out.println(A.name+" "+A.age);
    }
}
