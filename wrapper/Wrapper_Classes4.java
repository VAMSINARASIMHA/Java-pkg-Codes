package wrapper;

public class Wrapper_Classes4 {
    public static void main(String[] args){
        //1. intValue()
        //Converts wrapper object Integer to int
        Integer obj = Integer.valueOf(100);
        int num = obj.intValue();
        System.out.println(num); // 100


        //2. byteValue()
        //Converts Integer to byte
        Integer obj1 = Integer.valueOf(126);
        byte b = obj1.byteValue();
        System.out.println(b); // if we mention more then 127 in obj1 then it prints some negative number(overflow happens).
        //Note: Byte range is -128 to 127, so overflow occurs.


        //3. shortValue()
        //Converts Integer to short
        Integer obj2 = Integer.valueOf(500);
        short s = obj2.shortValue();
        System.out.println(s); // 500

        //same code follows for "4. longValue()", "5. floatValue()", "6. doubleValue()", "7. charValue()", "8. booleanValue()" in java.
    }
}
