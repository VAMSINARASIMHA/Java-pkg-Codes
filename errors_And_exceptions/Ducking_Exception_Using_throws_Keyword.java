package errors_and_exceptions;


//Example-1:
class Vamsi
{
    public void show() throws ClassNotFoundException //"""Exception""" (or) """ClassNotFoundException,Exception""" is also applicable here.
    {
        Class.forName("toString_Method0O0");
    }
}
public class Ducking_Exception_Using_throws_Keyword
{
    static
    {
        System.out.println("Ducking Exception");
    }
    public static void main(String[] ar) // (or) here, we can declare Exception in the main method like this ----->"""throws Exception""" 
    {
        Vamsi obj = new Vamsi();
        // obj.show();                    //if we declare throws Exception in main method then we access the object like this ---->"""obj.show();"""
        try
        {
            obj.show();
            System.out.println("Entered File Is A Valid File");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("The Given File Name Is Wrong   "+e);
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.print("Something Went Wrong" +e);
            e.printStackTrace();
        }
    }
}







//Example-2:

// import java.io.*;

// class FileExample {
//     @SuppressWarnings("unused")

//     static void readFile() throws IOException {

//         @SuppressWarnings("resource")
//         FileReader fr = new FileReader("toString_MethodOO0.java"); //if we mentioned a correct file name then the output is  "File opened",After the next line "You Opened A Correct File"   and if we not mentioned a correct file then the output is "IOException handled".

//         System.out.println("File opened");
//     }

//     public static void main(String[] args) 
//     {

//         try 
//         {
//             readFile();
//             System.out.println("You Opened A Correct File");
//         }
//         catch(IOException e) {
//             System.out.println("IOException handled");
//         }

//     }
// }