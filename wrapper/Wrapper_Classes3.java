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









/*

        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);  // true
        System.out.println(a.equals(b));  // true


        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);  // false
        System.out.println(x.equals(y));  // true 


        //Java internally uses a cache for Integer objects in the range: -128 to 127
        //This is called the Integer Cache.
        //Java does not create two objects.
        //Instead, both a and b point to the same cached object.
        //So: a == b  → true (same reference)


        //Because 200 is outside the cache range (-128 to 127).
        //Java creates two different objects.
        //So: x == y  → false (different references)
        //so  "System.out.println(x == y);  // false".


        /*
        == → compares reference
        .equals() → compares value


*/


