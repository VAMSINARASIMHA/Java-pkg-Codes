package ThisKeyword_in_Java_Through_Constructor;

//this to Call Current Class Method
public class This_Examples {
    void display() {
        this.show();
        System.out.println("Display method");
    }
    void show() {
        System.out.println("Show method");
    }
    public static void main(String[] args) {
        This_Examples s1 = new This_Examples();
        s1.display();
    }
}





/*
//this() Calling Another Constructor
class Test {

    Test() {
        this(10);
        System.out.println("Default constructor");
    }

    Test(int x) {
        System.out.println("Parameterized constructor");
    }

    public static void main(String[] args) {
        new Test();
    }
}
//Output:
        Parameterized constructor
        Default constructor    
*/






/*
//this returns the current object
Example 1:
class Test {
    Test show() {
        System.out.println("Hello");
        return this;
    }
    public static void main(String[] args) {
        Test t = new Test(); // constructor call
        t.show().show().show(); // method call
    }
}

output:
        Hello
        Hello   
        Hello



1️) Test show() means:
    The method returns an object of class Test.



----->1️) Test show() means:
            The method returns an object of class Test.

            Normally you might see:
            void show()
            That means no value is returned.

            But here:
            Test show()
            means this method returns a Test object.


                                                (or)


Example 2:
public class Test {
    Test show() {
        System.out.println("Hello");
        return this;
    }
    Test display() {
        System.out.println("World");
        return this;
    }
    public static void main(String[] args) {
        Test t = new Test();
         t.show().display();
    }
}                                               


output:
        Hello
        World

*/

