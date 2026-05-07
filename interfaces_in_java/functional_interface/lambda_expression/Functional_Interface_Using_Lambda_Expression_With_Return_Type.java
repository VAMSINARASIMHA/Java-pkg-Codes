package interfaces_in_java.functional_interface.lambda_expression;

// lambda expression with return type.
//Type-1:
@FunctionalInterface
interface MyFunctionalInterface {
    int myMethod(int i,int j);
}
public class Functional_Interface_Using_Lambda_Expression_With_Return_Type{
    public static void main(String[] args){
        MyFunctionalInterface obj = (int i,int j) -> {
            return i+j;
        };
        int result = obj.myMethod(4,5);
        System.out.println("The sum is: "+result);
    }
}


//Type-2:

// @FunctionalInterface
// interface MyFunctionalInterface {
//     int myMethod(int i,int j);
// }
// public class vvv{
//     public static void main(String[] args){
//         MyFunctionalInterface obj = (i,j) -> i+j;
//         int result = obj.myMethod(4,5);
//         System.out.println("The sum is: "+result);
//     }
// }