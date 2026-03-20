package wrapper;

public class Wrapper_Classes5{
    public static void main(String[] args){
        //1. String → int (Integer.parseInt)
        String str = "200";
        int num = Integer.parseInt(str);
        System.out.println(num + 50); // 250


        //2. String → double (Double.parseDouble)
        String str2 = "10.5";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2 * 2); // 21.0


        //3. int → String (String.valueOf)
        int num3 = 300;
        String str3 = String.valueOf(num3);
        System.out.println(str3 + 100); // 300100 (concatenation)


        //4. String → Integer (using valueOf)
        String str4 = "500";
        Integer num4 = Integer.valueOf(str4);
        System.out.println(num4 + 100); // 600


        //5. String → boolean
        String str5 = "true";
        boolean flag = Boolean.parseBoolean(str5);
        System.out.println(flag); // true


        //6. String → char (no direct method)
        String str6 = "Hello";
        char ch = str6.charAt(0);
        System.out.println(ch); // H


        /*
        parseInt() → returns primitive int
        valueOf() → returns Wrapper object
        Autoboxing = primitive → object
        Unboxing = object → primitive
        */



        /*
        Integer a = Integer.valueOf("10"); // Wrapper object
        int b = Integer.parseInt("10");    // primitive
        */
    }
}


