package constructor;

class Student {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {

        Student s = new Student(); //default constructor is called here and it is provided by java compiler if we do not create any constructor in our class. and it initializes the instance variables with default values. here int id is initialized with 0 and String name is initialized with null.
        s.display();
    }
}

/*
If you don't write a constructor, Java internally creates something like this:
Student() {
        // empty constructor created by Java
    }
*/
