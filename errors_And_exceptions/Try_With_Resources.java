package errors_and_exceptions;


//try-with-resources in Java:-

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Try_With_Resources
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        int num;
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        { 
            num = Integer.parseInt(br.readLine());    //Here, ""readLine()"" will gives you the String Value. but it converts Integer.
            System.out.println(num);

            str = br.readLine();                 //Here, ""readLine()"" will gives you the Complete String Value.
            System.out.println(str);
        }
    }
}









// Custom Resource:-
// You can create your own resource by implementing AutoCloseable.

// class vamsi implements AutoCloseable
// {
//     void show()
//     {
//         System.out.println("In show");
//     }
//     @Override
//     public void close()
//     {
//         System.out.println("Resource closed");
//     }
// }
// public class Try_With_Resources
// {
//     public static void main(String[] ar)
//     {
//         try(vamsi obj = new vamsi())
//         {
//             obj.show();
//         }
//         catch (Exception e) 
//         {
//             System.out.println("Somethimg Went Wrong" +e);
//             e.printStackTrace();
//         }
//     }
// }










//Multiple Custom Resources:-

// class Car implements AutoCloseable
// {
//     void show()
//     {
//         System.out.println("In show");
//     }
//     @Override
//     public void close()
//     {
//         System.out.println("Resource closed");
//     }
// }
// class Bike implements AutoCloseable
// {
//     void show()
//     {
//         System.out.println("In show");
//     }
//     @Override
//     public void close()
//     {
//         System.out.println("Resource closed");
//     }
// }
// public class Try_With_Resources
// {
//     public static void main(String[] ar)
//     {
//         try
//         (
//             Car obj = new Car();
//             Bike obj1 = new Bike()
//         )
//         {
//             obj.show();
//             obj1.show();
//         }
//         catch (Exception e) 
//         {
//             System.out.println("Somethimg Went Wrong" +e);
//             e.printStackTrace();
//         }
//     }
// }











//Here , we can use finally block also, but it will not used for closing the resources. because of the try-with-resources syntax is used in this code.

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class Try_With_Resources
// {
//     public static void main(String[] args) throws NumberFormatException, IOException
//     {
//         int num;
//         String str;
//         try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
//         { 
//             num = Integer.parseInt(br.readLine());    //Here, ""readLine()"" will gives you the String Value. but it converts Integer.
//             System.out.println(num);

//             str = br.readLine();                 //Here, ""readLine()"" will gives you the Complete String Value.
//             System.out.println(str);
//         }
//         catch(Exception e)
//         {
//             System.out.println("Something Went Wrong"+e);
//             e.printStackTrace();
//         }
//         finally
//         {
//             System.out.println("The Finally Block Is Executed, But Not Used To Close The Resources.");
//         }
//     }
// }