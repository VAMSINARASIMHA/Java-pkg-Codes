package polymorphism;


//Polymorphism means “many forms.” It allows us to perform a single action in different ways. In Java, there are two types of polymorphism: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).
//In Java, polymorphism allows one method or object to behave differently depending on the situation.
/*  
1. Compile-Time Polymorphism (Method Overloading):
This happens when multiple methods have the same name but different parameters.
The compiler decides which method to call.
*/
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(5, 10));        // method 1
        System.out.println(c.add(5, 10, 15));    // method 2
        System.out.println(c.add(5.5, 4.5));     // method 3
    }
}

//Here the method name is the same (add) but parameters are different. The compiler determines which method to call based on the number and type of arguments passed. This is an example of compile-time polymorphism.   



