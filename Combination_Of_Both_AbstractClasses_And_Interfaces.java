//code-1:-

// Abstract Class Implements Interface In Java.

interface A 
{
    void show();
    void display();
}
abstract class B implements A 
{
    public void show() 
    {
        System.out.println("in show");
    }
    public abstract void display();
}
class C extends B 
{
    public void display() 
    {
        System.out.println("in display");
    }
}
public class Combination_Of_Both_AbstractClasses_And_Interfaces
{
    public static void main(String[] args) 
    {
        C obj = new C();
        obj.show();
        obj.display();
    }
}







//code-2:-

/* 

//Interface + Abstract Class + Multiple Classes



interface A 
{
    void show();
}
abstract class B implements A 
{
    public void display() 
    {
        System.out.println("in display");
    }
}
class C extends B 
{
    public void show() 
    {
        System.out.println("in show1");
    }
}
class D extends B 
{
    public void show() 
    {
        System.out.println("in show2");
    }
}
public class Combination_Of_Both_AbstractClasses_And_Interfaces {
    public static void main(String[] args) {

        C obj = new C();
        obj.show();
        obj.display();

        D obj1 = new D();
        obj1.show();
        obj1.display();
    }
}

//note:- Multiple and Hybrid inheritances will support in both interfaces and abstract class in java.

*/










//code-3:-

/* 

//Abstract class can implement multiple interfaces in java



interface A 
{
    void show();
}

interface B 
{
    void display();
}

abstract class Test implements A, B 
{
    public void show() 
    {
        System.out.println("Show method");
    }
}

class Demo extends Test 
{
    public void display() 
    {
        System.out.println("Display method");
    }
}

public class Combination_Of_Both_AbstractClasses_And_Interfaces 
{
    public static void main(String[] args) 
    {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}

*/









//code-4:-

/* 



interface A 
{
    void show();
}

abstract class B 
{
    void display() 
    {
        System.out.println("in display");
    }
}

class C extends B implements A
{
    public void show() 
    {
        System.out.println("in show");
    }
}
public class Combination_Of_Both_AbstractClasses_And_Interfaces
{
    public static void main(String[] args) 
    {
        C obj = new C();
        obj.display();
        obj.show();
    }
}

*/
