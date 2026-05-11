package enum_in_java;


//enum with instance variable and constructor.
enum Laptop{
    HP(45000),
    DELL(50000),
    SAMSUNG,
    LENOVO(85000);

    int price; //instance variable

    Laptop(){       //a default constructor.
       price=120000;
    }

    Laptop(int p){ //a parameterized constructor.
        this.price = p;
    }

    int getPrice(){ //a method to get the price of the laptop.
        return price;
    }
}
public class Enum_With_Variables_And_Constructor{
    public static void main(String[] args) {
        // Laptop laptop = Laptop.HP;
        // System.out.println(laptop.getPrice());
        // System.out.println(Laptop.DELL.getPrice());
        // System.out.println(Laptop.LENOVO.getPrice());
        for(Laptop l : Laptop.values())
        {
            System.out.println(l + " costs is " + l.getPrice());
        }

    }
}









// enum Cricket{
//     SIX,
//     four,
//     one,
//     draw,
//     out
// }
// public class vvv{
//     public static void main(String[] ar){
//         Cricket obj = Cricket.SIX;
//         System.out.println(obj.name());
//         System.out.println(Cricket.SIX.name());
//         System.out.println(obj.getClass().getSuperclass().getName());
        

//     }
// }