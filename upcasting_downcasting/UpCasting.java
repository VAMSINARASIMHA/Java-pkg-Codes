package upcasting_downcasting;  
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
public class UpCasting {
    public static void main(String args[]){
        /*  A obj =  new B();
            obj.show();                 //here, it is also upcasting. but in the below code it is not necessary to write (A) because it is called automatically done by the JVM compiler.
        */                   
        A obj =(A) new B(); // upcasting(Child to Parent).  it will print only """Hello""" because it is the parent class reference variable.
        obj.show();
    }
}
// Upcasting + Inheritance.


//Note: if we change the display() method into show() method in class B, then it will print """Welcome""" because of the concept of method overriding. then it performs """Upcasting + Inheritance + Runtime Polymorphism(Method Overriding)""".
//example: for """Upcasting + Inheritance + Runtime Polymorphism(Method Overriding)""" is given below:


// class A{
//     void show(){
//         System.out.println("Hello");
//     }
// }
// class B extends A{
//     void show(){
//         System.out.println("Welcome");
//     }
// }
// public class pra{
//     public static void main(String args[]){
//         /*  A obj =  new B();
//             obj.show();                 //here, it is also upcasting. but in the below code it is not necessary to write (A) because it is called automatically done by the JVM compiler.
//         */                   
//         A obj =(A) new B(); // upcasting(Child to Parent).  it will print only """Welcome""" because it is the parent class reference variable.
//         obj.show();
//     }
// }


