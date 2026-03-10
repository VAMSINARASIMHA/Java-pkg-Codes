package constructor;

class Person {

    int id;
    String name;

    Person() {
        this(100, "Default");
    }

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person(101, "Vamsi");

        p1.display();
        p2.display();
    }
}

//using """this()""" is used to call another constructor of the same class.

/*
this can be used to:
1️) Refer to current class instance variable
2️) Call current class constructor (this())
3️) Pass current object as parameter
4️) Return current object
*/

/*
Important Rules of this():
1) Used to call another constructor in the same class
2) Must be the first statement in the constructor
3) Used mainly in constructor overloading

example:
Student() {
        this(100, "Default"); // must be first line in the constructor. 
    }
*/

