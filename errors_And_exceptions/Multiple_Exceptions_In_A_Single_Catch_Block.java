package errors_and_exceptions;


//Multiple Exceptions in a single catch block.
public class Multiple_Exceptions_In_A_Single_Catch_Block
{
    @SuppressWarnings("null")
    public static void main(String[] args) 
    {
        try 
        {
            
            @SuppressWarnings("unused")
            int result = 10 / 0;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
            String str = null;
            System.out.println(str.length());
        } 
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) 
        {
            System.out.println("Math error or array error or NullPointer error occurred.");
        }
        catch (Exception e) 
        {
            System.out.println("Something went wrong: " + e);
        }
    }
}






//Nested try block.
// public class vvv {
//     @SuppressWarnings("null")
//     public static void main(String args[]) {
//       try 
//       {
//             int a=10;
//             int b=5;
//             System.out.println(a/b);
//             try
//             {
//                 String str = null;
//                 System.out.println(str.length());
//             }
//             catch(NullPointerException e)
//             {
//                 System.out.println("It is an Empty String" +e);
//             }
//       }
//       catch(ArithmeticException e)
//       {
//         System.out.println("Don't Divide With Zero" +e);
//       }
//       catch(Exception e)
//       {
//         System.out.println("Something Went Wrong" +e);
//       }
//     }
// }