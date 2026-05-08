package interfaces_in_java;

 
// An interface declared inside another class or an interface is known as Nested Interface.

class Outer {
    interface Inner {
        void display();
    }
}

class Test implements Outer.Inner {
    public void display() {
        System.out.println("Nested Interface");
    }
}
public class Nested_Interface{
    public static void main(String[] ar){
        Test obj = new Test();
        obj.display();
    }
}




//Nested Interface through anonymous inner class in java.

// class Outer 
// {
//     interface Inner 
//     {
//         void display();
//     }
// }
// public class vvv
// {
//     public static void main(String[] ar)
//     {
//         Outer.Inner obj = new Outer.Inner() 
//         {
//             public void display() 
//             {
//                 System.out.println("Nested Interface");
//             }
//         };
//         obj.display();
//     }
// }



//Nested Interface through Lambda Expression in java.

// class Outer 
// {
//     interface Inner 
//     {
//         void display();
//     }
// }
// public class vvv
// {
//     public static void main(String[] ar)
//     {
//         Outer.Inner obj = () ->System.out.println("Nested Interface");
//         obj.display();
//     }
// }


