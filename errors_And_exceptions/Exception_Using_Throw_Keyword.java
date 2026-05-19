package errors_and_exceptions;

// A normal try-catch block to handle an ArithmeticException when dividing by zero. In this case, it will catch the exception and print a default message along with the exception details. Then it will assign a new value to 'b' and it will print the output.

// public class Exception_Using_Throw_Keyword{
//     public static void main(String[] ar){
//         int a=0;
//         int b=0;
//         try{
//             b=5/a; // This will throw an ArithmeticException because of division by zero.
//         }
//         catch(ArithmeticException e){
//             System.out.println("its a default Output: " +e);
//             b=5/2; //it will Handle the exception and assign a new value to 'b'.
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong: " +e);
//         }
//         System.out.println(b);
//         System.out.println("Out of the block");
//     }
// }

















//code:-1

// public class Exception_Using_Throw_Keyword{
//     public static void main(String[] ar){
//         int a=6;
//         int b=0;
//         try{
//             b=5/a; // This will not throw an ArithmeticException because 'a' is not zero. but i don't want to print zero.
//         }
//         catch(ArithmeticException e){
//             System.out.println("its a default Output: " +e);
//             b=5/2; //Here it will not execute because there is no exception thrown in the try block.
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong: " +e);
//         }
//         System.out.println(b);
//         System.out.println("Out of the block");
//     }
// }



//i don't want to print zero so i will throw an exception when b is zero and handle it in the catch block. this is how we can use the throw keyword to throw an exception manually.
//code:-2

public class Exception_Using_Throw_Keyword{
    public static void main(String[] ar){
        int a=6;
        int b=0;
        try{
            b=5/a; //i don't want to print zero. so i will throw an exception when b is zero and handle it in the catch block.
            if(b==0){
                throw new ArithmeticException("I don't want to print zero"); // This will throw a custom ArithmeticException with a message.
            }
        }
        catch(ArithmeticException e){
            System.out.println("its a default Output: " +e);
            b=5/2; //it will Handle the exception and assign a new value to 'b'.
        }
        catch(Exception e){
            System.out.println("Something went wrong: " +e);
        }
        System.out.println(b);
        System.out.println("Out of the block");
    }
}