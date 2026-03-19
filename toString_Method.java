/*
 What is toString()?
toString() is a method from the class
It is used to convert an object into a readable string representation.







if we dont write this 
            public String toString(){
            return model+" : "+price+"Rs";
            }
    Then it prints this type of output
    Laptop@372f7a8d






Why we use toString()?

To print object details

For debugging

For logging

Makes output human-readable







Without toString()	  ClassName@Hashcode
With toString()	      Custom readable data





toString() = how your object looks when printed
*/

class Laptop{
    String model;
    int price;
    public String toString(){
         return model+" : "+price+"Rs";
     }
}
public class toString_Method {
    public static void main(String[] args) {
        Laptop a = new Laptop();
        a.model = "Lenovo";
        a.price = 64000;  
        System.out.println(a);
        // System.out.println(a.toString()); internally in java it is called when we print the object 'a'.
    }
}

