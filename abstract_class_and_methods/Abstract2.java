package abstract_class_and_methods;

abstract class Car{
    public abstract void bmw();
    public abstract void ferari();
    public void Moving(){
        System.out.println("car is Moving"); 
    }
    public Car(){
    System.out.println("Hai Car");
}
}


abstract class BMW extends Car{
    public void bmw(){
        System.out.println("Hai BMW");
    }
    
}
class bugati extends BMW{
    public void ferari(){
        System.out.println("Hai Ferari");
    }
}
public class Abstract2{
public static void main(String args[]){
 // Car obj = new BMW();  // it will not work because BMW is abstract class.
    Car obj = new bugati();
    obj.bmw();
    obj.ferari();
    obj.Moving();
    }
}
