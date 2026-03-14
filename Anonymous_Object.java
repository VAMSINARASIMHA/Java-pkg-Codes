class Test {
    Test(){
        System.out.println("Object is created");
    }
    void show() {
        System.out.println("Hello");
    }
    
}
public class Anonymous_Object {
    public static void main(String[] args) {
        new Test().show(); // anonymous object
        new Test().show(); // anonymous object    
    }
}



/*

//Example with Constructor Call

class Test {
    Test() {
        System.out.println("Object Created");
    }
}
public class Main {
    public static void main(String[] args) {
        new Test(); // anonymous object
    }
}

*/

