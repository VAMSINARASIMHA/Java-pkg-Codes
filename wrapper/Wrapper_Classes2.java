package wrapper;

/*
Java Wrapper Classes : 
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

The table below shows the primitive type and the equivalent wrapper class:

Primitive_Data_Type	           Wrapper Class
byte	                       Byte
short	                       Short
int	                           Integer
long	                       Long
float	                       Float
double	                       Double
boolean	                       Boolean
char	                       Character

*/



public class Wrapper_Classes2 {
  public static void main(String[] args) {
    Integer myInt = 50;
    Double myDouble = 5.99;
    Character myChar = 'A';
    String myString = myInt.toString();
    System.out.println(myInt);
    System.out.println(myDouble);
    System.out.println(myChar);
    System.out.println(myString);  //it will print the string representation of the integer value, which is "50". where,here '50' is called a string not an integer. 
    System.out.println(myString.length());
    System.out.println(myInt.getClass().getName()); 
    System.out.println(myDouble.getClass().getName());
    System.out.println(myChar.getClass().getName());
    System.out.println(myString.getClass().getName());
  }
}

/*
Sometimes you must use wrapper classes, 
for example when working with Collection objects, such as ArrayList, where primitive types cannot be used (the list can only store objects):
ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
*/



