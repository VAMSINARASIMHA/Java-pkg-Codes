package super_keyword;

class Ram{
   int a=10;
}
class Ravi extends Ram{
   int a=20;

public void show(){
    System.out.println(super.a); //Access Parent Attributes
    System.out.println(this.a); //Access Current Class Attributes
    System.out.println(this.a+super.a);
    }
}
public class Super_Keyword3 {
    public static void main(String[] args){
        Ravi obj = new Ravi();
        obj.show();
    }
}

