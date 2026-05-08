package interfaces_in_java;

interface A{

}
class B implements A
{
    void show(){
        System.out.println("Hello, World!");
    }
}
public class Marker_Interface {
    public static void main(String[] ar){
        B obj = new B();
        if(obj instanceof A){
            obj.show();
        }
        else{
            System.out.println("Object is not an instance of interface A");
        }
    }
}
