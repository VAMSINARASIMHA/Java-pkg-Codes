package errors_and_exceptions;

//Example-1:

// import java.io.IOException;
// public class User_Input_Using_BufferedReader{
//     public static void main(String[] ar) throws IOException{
//         System.out.println("Enter a number");
//         int n =System.in.read();
//         System.out.println(n-48);
//     }
// }      //Here, It Prints the output Number as Ascii-Values Format By the User. 







//Example-2:

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// public class User_Input_Using_BufferedReader{
//     public static void main(String[]ar) throws NumberFormatException, IOException{
//         InputStreamReader isr = new InputStreamReader(System.in);
//         BufferedReader br = new BufferedReader(isr);
//        int num = Integer.parseInt(br.readLine());    //Here, ""readLine()"" will gives you the String Value. but it converts Integer. 
//        System.out.println(num);
//        br.close();  
        
//     }
// }        //Here, It Prints the Perfect Normal Number Output By the User Using BufferedReader. 







//Example-3:

// BufferedReader Using Try And Final For The User Input:-
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class User_Input_Using_BufferedReader
{

    public static void main(String[] ar) throws IOException
    {
        BufferedReader br = null;
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            System.out.print("Enter Your Name: ");
            String str =br.readLine();
            System.out.println("My Name Is : "+str);
        }
        finally
        {
            br.close();
            System.out.println("Finally Block Is Executed.");
        }
    }
}
//Here, Finally Block is mainly used to close the Resources in java.
//Example:- TO Close The SQL Database Connectivity,To Close The Opened Files in Java,ETC...




//Example-4:

// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
// public class User_Input_Using_BufferedReader
// {
//     public static void main(String[]ar) throws NumberFormatException, IOException
//     {
//         BufferedReader br = new BufferedReader(new FileReader("toString_Method.java"));
//           String Line;
//           while((Line=br.readLine()) != null)
//           {
//             System.out.println(Line);        
//           }
//           br.close();  
//     }
// } 




//Example-5:

// import java.io.*;
// public class User_Input_Using_BufferedReader
// {
//     public static void main(String[] args) throws Exception 
//     {
//         BufferedReader br = new BufferedReader(new FileReader("vvv.java"));
//         // Read while data is ready
//         while (br.ready()) 
//         {
//             String line = br.readLine();
//             System.out.println(line);
//         }
//         br.close();
//     }
// }

