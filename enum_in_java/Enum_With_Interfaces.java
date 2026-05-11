package enum_in_java;

// Enum Can Implement Interfaces
interface Show {
    void display();
}

enum Demo implements Show {

    HELLO,
    WELCOME,
    JAVA;

    public void display() {
        System.out.println("Message from: " + this);
    }
}

public class Enum_With_Interfaces{

    public static void main(String[] args) {

        Demo d1 = Demo.HELLO;
        Demo d2 = Demo.WELCOME;
        Demo d3 = Demo.JAVA;

        d1.display();
        d2.display();
        d3.display();
    }
}









// Another Advanced Version of Enum Implementing Interface


// interface Show {
//     void display();
// }

// enum Demo implements Show {

//     HELLO {
//         public void display() {
//             System.out.println("Hello World");
//         }
//     },

//     BYE {
//         public void display() {
//             System.out.println("Good Bye");
//         }
//     };
// }

// public class Enum_With_Interfaces {

//     public static void main(String[] args) {

//         Demo.HELLO.display();
//         Demo.BYE.display();
//     }
// }