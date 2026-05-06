package interfaces_in_java;

interface A{
    String name = "Vamsi";  //in interface "public static final" is default in every variable.we don't need to mension seperately the variable as """public static final String name = "Vamsi";""" 
    int age = 21;

    void show();             //in interface "public abstract" is default in every method.we don't need to mension seperately the method as """public abstract void show();""" 
    void display();
}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("Welcome");
    }
}
public class Single_Interface{
    public static void main(String[] args){
        A obj = new B();
        obj.show();
        obj.display();
        System.out.println(A.name+" "+A.age);
    }
}
