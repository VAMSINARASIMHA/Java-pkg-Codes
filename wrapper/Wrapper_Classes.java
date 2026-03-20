package wrapper;
public class Wrapper_Classes {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5;
        System.out.println(b);
        System.out.println(b.getClass().getName());
        System.out.println(a);
        System.out.println(((Object)a).getClass().getName());
        System.out.println(a + b);
        System.out.println(a==b);
        System.out.println(((Object)a).equals(b));


        int c = 128;
        Integer d = new Integer(c); //this is boxing, creating an Integer object from a primitive int.  and also it is deprecated in Java 9 and later versions, so it's recommended to use Integer.valueOf(c) instead of new Integer(c). 
        System.out.println(d); 

        

        int e = 25;
        Integer f = e; // this is autoboxing, automatically converting a primitive int to an Integer object.
        System.out.println(f);

        int g = f.intValue(); // this is unboxing, converting an Integer object back to a primitive int.
        System.out.println(g);

        int g1 = f; // this is auto-unboxing, automatically converting an Integer object to a primitive int.
        System.out.println(g1);


        String str = "100";
        int num = Integer.parseInt(str); // converting a String to an int using parseInt method.
        System.out.println(num*2); 

        Integer num2 = Integer.valueOf(str); // converting a String to an Integer object using valueOf method.
        System.out.println(num2*2);


    }
}


