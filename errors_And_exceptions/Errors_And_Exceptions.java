package errors_and_exceptions;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Errors_And_Exceptions{
    @SuppressWarnings({ "null", "resource" })
    public static void main(String[] ar){
        try{


        
        //FileNotFoundException    
        FileReader fr = new FileReader("vv.java");
        System.out.println(fr.read());
        fr.close();




        //NegativeArraySizeException    
        int[] arra = new int[-5];
        System.out.println(arra.length);




        //IllegalArgumentException
        Thread.sleep(-1);    




        //NumberFormatException    
        int n = Integer.parseInt("abc");
        System.out.println(n);    




        //StringIndexOutOfBoundsException
        String st="Vamsi";
        System.out.println(st.charAt(10));    




        //NullPointerException    
        String s=null;
        System.out.println(s.length());




        //InputMismatchException    
        Scanner sc = new Scanner(System.in);
        int str= sc.nextInt();
        System.out.println(str);



       
        //ArrayIndexOutOfBoundsException    
        int[] arr={10,20,30};
        System.out.println(arr.length);
        System.out.println(arr[4]);




        //ClassNotFoundException    
        Class.forName("Vamsi.txt");





        //ArithmeticException    
        int a=10;
        int b=5;
        System.out.println(a/b);

        }
        catch(ArithmeticException e){
            System.out.println("We Can't divide with Zero"+e);
        }
        catch(ClassNotFoundException e){
            System.out.println("This class is not exist"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The Size of the array is out of the Range"+"   "+e);
        }
        catch(InputMismatchException e){
            System.out.println("Enter a valid Input    "+e);
        }
        catch(NullPointerException e){
            System.out.println("This is Null Pointer Exception          "+e);
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("The String Index is out of the Range     "+e);
        }
        catch(NumberFormatException e){
            System.out.println("The String can't be converted to Integer     "+e);
        }
        catch(IllegalArgumentException e){
            System.out.println("The Argument is Illegal     "+e);
        }
        catch(NegativeArraySizeException e){
            System.out.println("The Array Size is Negative     "+e);
        }
        catch(FileNotFoundException e){
            System.out.println("The File is not Found     "+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong"+e);
        }
    }
}
