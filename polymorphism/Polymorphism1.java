package polymorphism;

//runtime polymorphism (method overriding):
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

    }
}

