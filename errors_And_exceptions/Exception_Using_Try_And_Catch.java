package errors_and_exceptions;


// public class Exception_Using_Try_And_Catch{
//     public static void main(String[] ar){
//         int a=0;
//         int b=50/a;                         //the flow of the code is end here.due to ArithmeticException.
//         System.out.println(b);             //From This line onWards the exhuation of code will stop.
//         System.out.println("bye");
//     }
// }





public class Exception_Using_Try_And_Catch
{
    public static void main(String[] args)
    {
        int a=0;      //if a=10 then output will be 5 and no error will occur and here b value is 5 because 50/10=5
        int b=0;     //if a=0 then output will be 0 and error will occur and here b value is 0 because 50/0 is not possible and it will throw an exception
        try
        {
             b=50/a;
        }
        catch(Exception e)
        {
            System.out.println("ArithmeticException Error is Occured.        "+e);
        }
        System.out.println(b);
        System.out.println("Bye");
    }
}
