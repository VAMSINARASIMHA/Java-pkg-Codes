package super_keyword;

//Access Parent Methods
class vamsi{
    void show(){
        System.out.println("Hai");
    }
}
class Narasimha extends vamsi{
    void show(){
        super.show(); // Call the parent method
        System.out.println("Hello");
    }
}
public class Super_Keyword2 {
    public static void main(String[] args){
        Narasimha obj = new Narasimha();
        obj.show();
    }
}
