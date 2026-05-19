package errors_and_exceptions;


 class VamsiException extends Exception {         //we can replace (or) uses "RuntimeException" in the place of "Exception".it will works perfectly. 
    public VamsiException(String message) { // Constructor to initialize the exception message
        super(message);
    }
}
public class Custom_Exception{
    public static void main(String[] ar){
        int a=10;
        int b=20;
        try{
            int c=a/b; //here 'c' value is (1/2)--->(0.5)--->zero"(0)".
            if(c==0){
                throw new VamsiException("This Is My Exception.");
            }
        }
        catch(VamsiException e){
            a=20;
            b=10;
            System.out.println(a/b);
            System.out.println("Exception thrown: " +e);
        }
        catch(Exception e){
            System.out.println("Something went wrong: " +e);
        }
        System.out.println("Bye");
    }
}


