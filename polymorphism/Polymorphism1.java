package polymorphism;

//runtime polymorphism (method overriding):
/* 
This happens when a child class provides its own implementation of a parent class method 
The method that runs is decided at runtime based on the object type, not the reference type.
*/
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        Animal a;             //Only one reference variable is used. But gives same output for "two different reference variables" also.  
        a = new Dog();
        a.sound();          //for polymorphism it is good to use one reference variable. It is more efficient and less memory consuming. It also makes the code more readable and maintainable.

        a = new Cat();
        a.sound();

    /*  
    Animal a = new Dog();              
    a.sound();                     
                                //two different reference variables are uded. but gives same output for "one reference variable" also.
    Animal b = new Cat();                
    b.sound();                  
    */
//polymorphism is exist only in the inheritance.
    }
}

