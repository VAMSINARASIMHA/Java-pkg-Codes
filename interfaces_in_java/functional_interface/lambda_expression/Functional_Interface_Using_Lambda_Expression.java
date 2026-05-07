package interfaces_in_java.functional_interface.lambda_expression;

//Type-1:-
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
public class Functional_Interface_Using_Lambda_Expression {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () ->
        {
            System.out.println("Hello from MyClass!");
        };
        obj.myMethod();
    }
}


// and other different ways to write lambda expression for functional interface.
//codes:-

//Type-2:-

// @FunctionalInterface
// interface MyFunctionalInterface {
//     void myMethod();
// }
// public class vvv {
//     public static void main(String[] args) {
//         MyFunctionalInterface obj = () -> System.out.println("Hello from MyClass!");
//         obj.myMethod();
//     }
// }




//Type-3:-

// @FunctionalInterface
// interface MyFunctionalInterface {
//     void myMethod(int i);
// }
// public class vvv {
//     public static void main(String[] args) {
//         MyFunctionalInterface obj = i ->              //here we can also write like "(int i)" or "(i)" or "i".
//         {
//             System.out.println("Hello from MyClass!"+" "+i);
//         };
//         obj.myMethod(4);
//     }
// }