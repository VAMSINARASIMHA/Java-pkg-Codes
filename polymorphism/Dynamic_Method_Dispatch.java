package polymorphism;

// Dynamic Method Dispatch: During runtime, the JVM determines which method to execute based on the actual object being referred to, not the reference type. This mechanism is called dynamic method dispatch.


// Dynamic Method Dispatch (Mechanism Example)
// It Focus: How Java decides which method to call
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();   // Child class
    }
}

//This decision-making process is called as Dynamic Method Dispatch in java.
//Runtime Polymorphism = behavior you see
//Dynamic Method Dispatch = logic JVM uses.

//Runtime Polymorphism is also known as Dynamic Method Dispatch.