package enum_in_java;

// Enum with Variables and Methods
enum Mobile {

    APPLE(80000),
    SAMSUNG(70000);

    int price;

    Mobile(int price) {
        this.price = price;
    }

    void display() {
        System.out.println(price);
    }
}

public class Enum_With_Variables_And_Methods {

    public static void main(String[] args) {

        Mobile.APPLE.display();
        Mobile.SAMSUNG.display();
    }
}





// Enum with Methods
// enum Operation {

//     ADD,
//     SUBTRACT;

//     public int calculate(int a, int b) {

//         if(this == ADD)
//             return a + b;
//         else
//             return a - b;
//     }
// }

// public class vvv {

//     public static void main(String[] args) {

//         System.out.println(Operation.ADD.calculate(10, 5));

//         System.out.println(Operation.SUBTRACT.calculate(10, 5));
//     }
// }