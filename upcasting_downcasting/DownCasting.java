package upcasting_downcasting;

//Converting a parent class reference back into a child class reference is called as downcating.
//This is explicit — we must manually cast. like this  B obj1 = (B) obj; 
class A{
    void show(){
        System.out.println("Hello");
    }
}
class B extends A{
    void display(){
        System.out.println("Welcome");
    }
}
public class DownCasting {
    public static void main(String args[]){        
        A obj =(A) new B(); // upcasting(Child to Parent).  it will print only """Hello""" because it is the parent class reference variable.
        obj.show();

        B obj1 = (B) obj; // downcasting(Parent to Child).
        obj1.display(); // it will print only """Welcome""" because it is the child class reference variable.
    }
}

