package wrapper;
public class Wrapper_Classes3 {
 public static void main(String[] args) {
        Integer obj = 10;   // autoboxing
        int num = obj;      // unboxing (internally calls intValue())   
        //it converts the Integer object back to a primitive int.
        System.out.println("Primitive int: " + num);
    }
}

//Integer age = null; // allowed
//int age2 = null;    // ERROR