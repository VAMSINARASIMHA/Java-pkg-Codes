package interfaces_in_java;

interface P{
    String Name = "Vamsi";  
    int Age = 21;

    void show(); 
    void display();
}
interface X{
    void run();
}
interface Y extends X{
    //an empyt interface block.
}
class Q implements P,Y{     //P,X or P,Y is also no error, because Y is extending X, so Q is indirectly implementing X interface.
    public void show(){
        System.out.println("Hello");
    }
    public void display(){
        System.out.println("Welcome");
    }
    public void run(){
        System.out.println("How are You?");
    }
}
public class Multiple_Interface{
    public static void main(String[] args){
        P obj = new Q();
        obj.show();
        System.out.println(P.Name+" "+P.Age);
        obj.display();

        X obj1 = new Q();
        obj1.run();
    }
}



//small example code of interface:--

/*

interface A{
    public static void show() {
        System.out.println("Hello");
    }
}
public class vvv implements A {
    public static void main(String[] args) {
        A.show();
    }
}

*/