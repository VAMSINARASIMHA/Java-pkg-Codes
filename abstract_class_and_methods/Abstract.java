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


class BMW extends Car{
    public void bmw(){
        System.out.println("Hai BMW");
    }
    public void ferari(){
        System.out.println("Hai Ferari");
    }
}
public class Abstract{
public static void main(String args[]){
    Car obj = new BMW();
    obj.bmw();
    obj.ferari();
    obj.Moving();
    }
}